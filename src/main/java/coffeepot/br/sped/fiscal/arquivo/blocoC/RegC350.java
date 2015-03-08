/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sped.fiscal.arquivo.blocoC;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 Jeandeson O. Merelis
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", id=true, constantValue = "C350"),
    @Field(name = "ser"),
    @Field(name = "subSer"),
    @Field(name = "numDoc"),
    @Field(name = "dtDoc"),
    @Field(name = "cnpjCpf", params = {DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY}),
    @Field(name = "vlMerc"),
    @Field(name = "vlDoc"),
    @Field(name = "vlDesc"),
    @Field(name = "vlPis"),
    @Field(name = "vlCofins"),
    @Field(name = "codCta"),
    //
    @Field(name = "regC370List"),
    @Field(name = "regC390List")
})
public class RegC350 {

    private String ser;
    private String subSer;
    private String numDoc;
    private Date dtDoc;
    private String cnpjCpf;
    private Double vlMerc;
    private Double vlDoc;
    private Double vlDesc;
    private Double vlPis;
    private Double vlCofins;
    private String codCta;
    //
    private List<RegC370> regC370List;
    private List<RegC390> regC390List;

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getSubSer() {
        return subSer;
    }

    public void setSubSer(String subSer) {
        this.subSer = subSer;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public Double getVlMerc() {
        return vlMerc;
    }

    public void setVlMerc(Double vlMerc) {
        this.vlMerc = vlMerc;
    }

    public Double getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(Double vlDoc) {
        this.vlDoc = vlDoc;
    }

    public Double getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }

    public Double getVlPis() {
        return vlPis;
    }

    public void setVlPis(Double vlPis) {
        this.vlPis = vlPis;
    }

    public Double getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(Double vlCofins) {
        this.vlCofins = vlCofins;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public List<RegC370> getRegC370List() {
        return regC370List;
    }

    public void setRegC370List(List<RegC370> regC370List) {
        this.regC370List = regC370List;
    }

    public List<RegC390> getRegC390List() {
        return regC390List;
    }

    public void setRegC390List(List<RegC390> regC390List) {
        this.regC390List = regC390List;
    }
}