package com.ruoyi.web.controller.zeamap;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.zeamap.domain.*;
import com.ruoyi.zeamap.service.ITraitTypeService;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.zeamap.service.IPhenotypeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * PhenotypeController
 * 
 * @author wj
 * @date 2023-10-11
 */
@RestController
@ControllerAdvice
@RequestMapping("/zeamap/Phenotype")
public class PhenotypeController extends BaseController
{
    @Autowired
    private IPhenotypeService phenotypeService;

    @Autowired
    private ITraitTypeService traitTypeService;


    /**
     * 查询Phenotype列表
     */
    @PreAuthorize("@ss.hasPermi('zeamap:Phenotype:list')")
    @GetMapping("/list")
    public TableDataInfo list(Phenotype phenotype)
    {
        startPage();
        List<Phenotype> list = phenotypeService.selectPhenotypeList(phenotype);
        return getDataTable(list);
    }

    /**
     * 导出Phenotype列表
     */
    @PreAuthorize("@ss.hasPermi('zeamap:Phenotype:export')")
    @Log(title = "Phenotype", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Phenotype phenotype)
    {
        List<Phenotype> list = phenotypeService.selectPhenotypeList(phenotype);
        ExcelUtil<Phenotype> util = new ExcelUtil<Phenotype>(Phenotype.class);
        util.exportExcel(response, list, "Phenotype数据");
    }

    /**
     * 获取Phenotype详细信息
     */
    @PreAuthorize("@ss.hasPermi('zeamap:Phenotype:query')")
    @GetMapping(value = "/{code}")
    public AjaxResult getInfo(@PathVariable("code") Long code)
    {
        return AjaxResult.success(phenotypeService.selectPhenotypeByCode(code));
    }

    /**
     * 新增Phenotype
     */
    @PreAuthorize("@ss.hasPermi('zeamap:Phenotype:add')")
    @Log(title = "Phenotype", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Phenotype phenotype)
    {
        return toAjax(phenotypeService.insertPhenotype(phenotype));
    }

    /**
     * 修改Phenotype
     */
    @PreAuthorize("@ss.hasPermi('zeamap:Phenotype:edit')")
    @Log(title = "Phenotype", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Phenotype phenotype)
    {
        return toAjax(phenotypeService.updatePhenotype(phenotype));
    }

    /**
     * 删除Phenotype
     */
    @PreAuthorize("@ss.hasPermi('zeamap:Phenotype:remove')")
    @Log(title = "Phenotype", businessType = BusinessType.DELETE)
	@DeleteMapping("/{codes}")
    public AjaxResult remove(@PathVariable Long[] codes)
    {
        return toAjax(phenotypeService.deletePhenotypeByCodes(codes));
    }

    @PostMapping("/year")
    public AjaxResult selectByYear(Long year){
        return AjaxResult.success(phenotypeService.selectPhenotypeByYear(year));
    }

    @PostMapping(value = "/name")
    public AjaxResult selectByname(String pedigree){
        try{
            pedigree= URLDecoder.decode(pedigree);
        }catch (UnsupportedOperationException e){
            e.printStackTrace();
        }
        return AjaxResult.success(phenotypeService.selectPhenotypeByname(pedigree));
    }

    @PostMapping("/Morphological")
    public AjaxResult selectMorph(String pedigree){
        try{
            pedigree= URLDecoder.decode(pedigree);
        }catch (UnsupportedOperationException e){
            e.printStackTrace();
        }
        MorphologicalVo[] morphologicalVos = phenotypeService.selectMorphologicalByname(pedigree);
        return AjaxResult.success(phenotypeService.meanMorphological(morphologicalVos));
    }

    @GetMapping ("/MorMean")
    public AjaxResult selectMorMean(){
        MorphologicalVo[] morphologicalVo = phenotypeService.selectAllMorphological();
        return AjaxResult.success(phenotypeService.meanMorphological(morphologicalVo));
    }

    @PostMapping("/Agronomical")
    public AjaxResult selectAgronomical(String pedigree){
        try{
            pedigree= URLDecoder.decode(pedigree);
        }catch (UnsupportedOperationException e){
            e.printStackTrace();
        }
        AgronomicalVo[] agronomicalVos = phenotypeService.selectAgronomicalByname(pedigree);
        return AjaxResult.success(phenotypeService.meanAgronomicalVo(agronomicalVos));
    }

    @GetMapping("/AgrMean")
    public AjaxResult selectAgrMean(){
        AgronomicalVo[] agronomicalVos = phenotypeService.selectAllAgronomical();
        return AjaxResult.success(phenotypeService.meanAgronomicalVo(agronomicalVos));
    }

    @PostMapping("/Date")
    public AjaxResult selectDateByName(String pedigree){
        try{
            pedigree= URLDecoder.decode(pedigree);
        }catch (UnsupportedOperationException e){
            e.printStackTrace();
        }
        BxDateVo[] bxDateVos = phenotypeService.selectBxDate(pedigree);
        if(bxDateVos.length==1){
            return AjaxResult.success(bxDateVos[0]);
        }
        return AjaxResult.success(phenotypeService.meanDate(bxDateVos));
    }

    @GetMapping("/DateMean")
    public AjaxResult selectMeanDate(){
        BxDateVo[] bxDateVos = phenotypeService.selectAllDate();
        return AjaxResult.success(phenotypeService.meanDate(bxDateVos));
    }

    @PostMapping("/Rates")
    public AjaxResult selectRateByName(String pedigree){
        try{
            pedigree= URLDecoder.decode(pedigree);
        }catch (UnsupportedOperationException e){
            e.printStackTrace();
        }
        BxRateVo[] bxRateVos = phenotypeService.selectBxRateByName(pedigree);
        if(bxRateVos.length==1){
            return AjaxResult.success(bxRateVos);
        }
        return AjaxResult.success(phenotypeService.MeanRate(bxRateVos));
    }

    @GetMapping("/RatesMean")
    public AjaxResult selectMeanRate(){
        BxRateVo[] rateVos = phenotypeService.selectAllRate();
        return AjaxResult.success(phenotypeService.MeanRate(rateVos));
    }


    @PostMapping("/location")
    public AjaxResult selectBylocation(String location){
        return AjaxResult.success(phenotypeService.selectPhenotypeByLocation(location));
    }

    @GetMapping("/all")
    public AjaxResult selectAll(){
        return AjaxResult.success(phenotypeService.selectAllPhenotype());
    }

    @PostMapping("/trait")
    public AjaxResult selectTrait(String trait){
        if(phenotypeService.isTrait(trait)){
            return AjaxResult.success("该性状不存在");
        }
        List<TraitVo> traitVos = phenotypeService.selectTVo();
        List<String> strings = phenotypeService.selectTrait(trait);
        return AjaxResult.success(phenotypeService.resultTrait(traitVos,strings));
    }

    @PostMapping("traitByName")
    public AjaxResult selectTraitByName(String pedigree,String trait){
        try{
            pedigree= URLDecoder.decode(pedigree);
        }catch (UnsupportedOperationException e){
            e.printStackTrace();
        }
        if(phenotypeService.isTrait(trait)){
            return AjaxResult.success("该性状不存在");
        }
        List<TraitVo> traitVos = phenotypeService.selectTVoByName(pedigree,trait);
        List<String> strings = phenotypeService.selectTraitByName(pedigree,trait);
        return AjaxResult.success(phenotypeService.resultTrait(traitVos,strings));
    }

    @PostMapping("/locationTrait")
    public AjaxResult selectTraitByGroup(String trait) {
        if(phenotypeService.isTrait(trait)){
            return AjaxResult.success("该性状不存在");
        }
        List<GeVo> geVos;
        List<String> strings;
        geVos = phenotypeService.selectGe(trait);
        strings = phenotypeService.selectTraitGroup(trait);
        return AjaxResult.success(phenotypeService.resultGeVo(geVos, strings));
    }

    @PostMapping("/locationTraitName")
    public AjaxResult selectTraitGroupByname(String pedigree,String trait){
        try{
            pedigree= URLDecoder.decode(pedigree);
        }catch (UnsupportedOperationException e){
            e.printStackTrace();
        }
        if(phenotypeService.isTrait(trait)){
            return AjaxResult.success("该性状不存在");
        }
        List<GeVo> geVos = phenotypeService.selectGeByName(pedigree,trait);
        List<String> strings = phenotypeService.selectTraitGroupByName(pedigree,trait);
        return AjaxResult.success(phenotypeService.resultGeVo(geVos,strings));
    }

    @GetMapping("/allMor")
    public AjaxResult selectAllMor(){
        return  AjaxResult.success(phenotypeService.selectAllMar());
    }

    @GetMapping("/allAgr")
    public AjaxResult selectallAgr(){
        return AjaxResult.success(phenotypeService.selectAllAgr());
    }

    @GetMapping("/allAbiotic")
    public AjaxResult selectallAbiotic(){
        return AjaxResult.success(phenotypeService.selectAllAbiotic());
    }

    @GetMapping("/allBiotic")
    public AjaxResult selectallBiotic(){
        return AjaxResult.success(phenotypeService.selectAllBiotic());
    }


    @GetMapping("/yearAgr")
    public AjaxResult selectYearAgr(){
        return AjaxResult.success(phenotypeService.selectYearAgr());
    }

    @GetMapping("/yearAbiotic")
    public AjaxResult selectYearAbiotic(){
        return AjaxResult.success(phenotypeService.selectYearAbiotic());
    }

    @GetMapping("/yearBiotic")
    public AjaxResult selectYearBiotic(){
        return AjaxResult.success(phenotypeService.selectYearBiotic());
    }

    @GetMapping("/yearMor")
    public AjaxResult selectYearMor(){
        return AjaxResult.success(phenotypeService.selectYearMor());
    }

    @GetMapping("/checkTraitTypeName")
    public AjaxResult checkTraitTypeName() {
        List<Integer> list = new ArrayList<>();
        String t1="Morphological";
        int n1=phenotypeService.countBx(t1);
        list.add(n1);
        String t2 = "Agronomical";
        int n2=phenotypeService.countBx(t2);
        list.add(n2);
        String t3="Abiotic stress";
        int n3 = phenotypeService.countBx(t3);
        String t4 = "Biotic stress";
        int n4=phenotypeService.countBx(t4);
        list.add(n3);
        list.add(n4);
        int n5=phenotypeService.countData();
        list.add(n5);
        return AjaxResult.success(list);
    }

    @PostMapping("/search")
    public AjaxResult search(String pedigree,Long year,String location,String trait){
        try{
            pedigree= URLDecoder.decode(pedigree);
        }catch (UnsupportedOperationException e){
            e.printStackTrace();
        }
        if(trait==null||trait.equals("")){
            return AjaxResult.success(phenotypeService.selectBy(pedigree,year,location));
        }
        if(phenotypeService.isTrait(trait)){
            return AjaxResult.success("该性状不存在");
        }
        List<String> strings=phenotypeService.searchTrait(pedigree,year,location,trait);
        List<SearchVo> searchVos = phenotypeService.selectWithTrait(pedigree,year,location,trait);
        return AjaxResult.success(phenotypeService.resultWith(searchVos,strings));
    }

    @ExceptionHandler(value = {java.sql.SQLSyntaxErrorException.class})
    public String handleException(Exception e){
        return "该性状不存在";
    }

    @ExceptionHandler(value = {java.lang.NumberFormatException.class})
    public String handleE2(Exception e){
        return "请输入正确格式";
    }

    @ExceptionHandler(value = {java.lang.NullPointerException.class})
    public String handleE3(Exception e){
        return "暂无数据";
    }

}

