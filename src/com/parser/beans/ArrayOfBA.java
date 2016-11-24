package com.fenintechnologies.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ba"
})
@XmlRootElement(name = "ArrayOfBA")
public class ArrayOfBA {

    @XmlElement(name = "BA")
    protected List<ArrayOfBA.BA> ba;

   
    public List<ArrayOfBA.BA> getBA() {
        if (ba == null) {
            ba = new ArrayList<ArrayOfBA.BA>();
        }
        return this.ba;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "aId",
        "firstName",
        "lastName",
        "email",
        "aDate",
        "expirationDateTime",
        "administeredByEmail",
        "administeredByFirstName",
        "administeredByLastName",
        "sMethod",
        "pNumber",
        "drUrl",
        "aPoIUrl",
        "folderPath",
        "pfUrl",
        "psUrl",
        "gender",
        "isDeleted",
        "aState",
        "naauEmail",
        "externalId",
        "externalPersonId",
        "aUserId",
        "aUrl",
        "aPass",
        "descriptiveReportPageUrl",
        "ppUrl",
        "sss",
        "scss",
        "pss"
    })
    public static class BA {

        @XmlElement(name = "AId")
        protected String aId;
        @XmlElement(name = "FirstName")
        protected String firstName;
        @XmlElement(name = "LastName")
        protected String lastName;
        @XmlElement(name = "Email")
        protected String email;
        @XmlElement(name = "ADate")
        protected String aDate;
        @XmlElement(name = "ExpirationDateTime")
        protected String expirationDateTime;
        @XmlElement(name = "AdministeredByEmail")
        protected String administeredByEmail;
        @XmlElement(name = "AdministeredByFirstName")
        protected String administeredByFirstName;
        @XmlElement(name = "AdministeredByLastName")
        protected String administeredByLastName;
        @XmlElement(name = "SMethod")
        protected String sMethod;
        @XmlElement(name = "PNumber")
        protected String pNumber;
        @XmlElement(name = "DRUrl")
        protected String drUrl;
        @XmlElement(name = "APoIUrl")
        protected String aPoIUrl;
        @XmlElement(name = "FolderPath")
        protected String folderPath;
        @XmlElement(name = "PFUrl")
        protected String pfUrl;
        @XmlElement(name = "PSUrl")
        protected String psUrl;
        @XmlElement(name = "Gender")
        protected String gender;
        @XmlElement(name = "IsDeleted")
        protected String isDeleted;
        @XmlElement(name = "AState")
        protected String aState;
        @XmlElement(name = "NAAUEmail")
        protected String naauEmail;
        @XmlElement(name = "ExternalId")
        protected String externalId;
        @XmlElement(name = "ExternalPersonId")
        protected String externalPersonId;
        @XmlElement(name = "AUserId")
        protected String aUserId;
        @XmlElement(name = "AUrl")
        protected String aUrl;
        @XmlElement(name = "APass")
        protected String aPass;
        @XmlElement(name = "DescriptiveReportPageUrl")
        protected String descriptiveReportPageUrl;
        @XmlElement(name = "PPUrl")
        protected String ppUrl;
        @XmlElement(name = "SSS")
        protected List<ArrayOfBA.BA.SSS> sss;
        @XmlElement(name = "SCSS")
        protected List<ArrayOfBA.BA.SCSS> scss;
        @XmlElement(name = "PSS")
        protected List<ArrayOfBA.BA.PSS> pss;

        /**
         * Gets the value of the aId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAId() {
            return aId;
        }

        /**
         * Sets the value of the aId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAId(String value) {
            this.aId = value;
        }

        /**
         * Gets the value of the firstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Gets the value of the lastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Gets the value of the aDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADate() {
            return aDate;
        }

        /**
         * Sets the value of the aDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADate(String value) {
            this.aDate = value;
        }

        /**
         * Gets the value of the expirationDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpirationDateTime() {
            return expirationDateTime;
        }

        /**
         * Sets the value of the expirationDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpirationDateTime(String value) {
            this.expirationDateTime = value;
        }

        /**
         * Gets the value of the administeredByEmail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdministeredByEmail() {
            return administeredByEmail;
        }

        /**
         * Sets the value of the administeredByEmail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdministeredByEmail(String value) {
            this.administeredByEmail = value;
        }

        /**
         * Gets the value of the administeredByFirstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdministeredByFirstName() {
            return administeredByFirstName;
        }

        /**
         * Sets the value of the administeredByFirstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdministeredByFirstName(String value) {
            this.administeredByFirstName = value;
        }

        /**
         * Gets the value of the administeredByLastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdministeredByLastName() {
            return administeredByLastName;
        }

        /**
         * Sets the value of the administeredByLastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdministeredByLastName(String value) {
            this.administeredByLastName = value;
        }

        /**
         * Gets the value of the sMethod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSMethod() {
            return sMethod;
        }

        /**
         * Sets the value of the sMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSMethod(String value) {
            this.sMethod = value;
        }

        /**
         * Gets the value of the pNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPNumber() {
            return pNumber;
        }

        /**
         * Sets the value of the pNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPNumber(String value) {
            this.pNumber = value;
        }

        /**
         * Gets the value of the drUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRUrl() {
            return drUrl;
        }

        /**
         * Sets the value of the drUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRUrl(String value) {
            this.drUrl = value;
        }

        /**
         * Gets the value of the aPoIUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAPoIUrl() {
            return aPoIUrl;
        }

        /**
         * Sets the value of the aPoIUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAPoIUrl(String value) {
            this.aPoIUrl = value;
        }

        /**
         * Gets the value of the folderPath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFolderPath() {
            return folderPath;
        }

        /**
         * Sets the value of the folderPath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFolderPath(String value) {
            this.folderPath = value;
        }

        /**
         * Gets the value of the pfUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPFUrl() {
            return pfUrl;
        }

        /**
         * Sets the value of the pfUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPFUrl(String value) {
            this.pfUrl = value;
        }

        /**
         * Gets the value of the psUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPSUrl() {
            return psUrl;
        }

        /**
         * Sets the value of the psUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPSUrl(String value) {
            this.psUrl = value;
        }

        /**
         * Gets the value of the gender property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGender() {
            return gender;
        }

        /**
         * Sets the value of the gender property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGender(String value) {
            this.gender = value;
        }

        /**
         * Gets the value of the isDeleted property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsDeleted() {
            return isDeleted;
        }

        /**
         * Sets the value of the isDeleted property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsDeleted(String value) {
            this.isDeleted = value;
        }

        /**
         * Gets the value of the aState property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAState() {
            return aState;
        }

        /**
         * Sets the value of the aState property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAState(String value) {
            this.aState = value;
        }

        /**
         * Gets the value of the naauEmail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAAUEmail() {
            return naauEmail;
        }

        /**
         * Sets the value of the naauEmail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAAUEmail(String value) {
            this.naauEmail = value;
        }

        /**
         * Gets the value of the externalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalId() {
            return externalId;
        }

        /**
         * Sets the value of the externalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalId(String value) {
            this.externalId = value;
        }

        /**
         * Gets the value of the externalPersonId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalPersonId() {
            return externalPersonId;
        }

        /**
         * Sets the value of the externalPersonId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalPersonId(String value) {
            this.externalPersonId = value;
        }

        /**
         * Gets the value of the aUserId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAUserId() {
            return aUserId;
        }

        /**
         * Sets the value of the aUserId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAUserId(String value) {
            this.aUserId = value;
        }

        /**
         * Gets the value of the aUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAUrl() {
            return aUrl;
        }

        /**
         * Sets the value of the aUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAUrl(String value) {
            this.aUrl = value;
        }

        /**
         * Gets the value of the aPass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAPass() {
            return aPass;
        }

        /**
         * Sets the value of the aPass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAPass(String value) {
            this.aPass = value;
        }

        /**
         * Gets the value of the descriptiveReportPageUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescriptiveReportPageUrl() {
            return descriptiveReportPageUrl;
        }

        /**
         * Sets the value of the descriptiveReportPageUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescriptiveReportPageUrl(String value) {
            this.descriptiveReportPageUrl = value;
        }

        /**
         * Gets the value of the ppUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPPUrl() {
            return ppUrl;
        }

        /**
         * Sets the value of the ppUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPPUrl(String value) {
            this.ppUrl = value;
        }

        public List<ArrayOfBA.BA.SSS> getSSS() {
            if (sss == null) {
                sss = new ArrayList<ArrayOfBA.BA.SSS>();
            }
            return this.sss;
        }

        public List<ArrayOfBA.BA.SCSS> getSCSS() {
            if (scss == null) {
                scss = new ArrayList<ArrayOfBA.BA.SCSS>();
            }
            return this.scss;
        }

        /**
         * Gets the value of the pss property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pss property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPSS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfBA.BA.PSS }
         * 
         * 
         */
        public List<ArrayOfBA.BA.PSS> getPSS() {
            if (pss == null) {
                pss = new ArrayList<ArrayOfBA.BA.PSS>();
            }
            return this.pss;
        }


      
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "as",
            "bs",
            "cs",
            "ds"
        })
        public static class PSS {

            @XmlElement(name = "AS")
            protected String as;
            @XmlElement(name = "BS")
            protected String bs;
            @XmlElement(name = "CS")
            protected String cs;
            @XmlElement(name = "DS")
            protected String ds;

            /**
             * Gets the value of the as property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAS() {
                return as;
            }

            /**
             * Sets the value of the as property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAS(String value) {
                this.as = value;
            }

            /**
             * Gets the value of the bs property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBS() {
                return bs;
            }

            /**
             * Sets the value of the bs property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBS(String value) {
                this.bs = value;
            }

            /**
             * Gets the value of the cs property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCS() {
                return cs;
            }

            /**
             * Sets the value of the cs property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCS(String value) {
                this.cs = value;
            }

            /**
             * Gets the value of the ds property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDS() {
                return ds;
            }

            /**
             * Sets the value of the ds property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDS(String value) {
                this.ds = value;
            }

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "as",
            "bs",
            "cs",
            "ds",
            "es"
        })
        public static class SCSS {

            @XmlElement(name = "AS")
            protected String as;
            @XmlElement(name = "BS")
            protected String bs;
            @XmlElement(name = "CS")
            protected String cs;
            @XmlElement(name = "DS")
            protected String ds;
            @XmlElement(name = "ES")
            protected String es;

            /**
             * Gets the value of the as property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAS() {
                return as;
            }

            /**
             * Sets the value of the as property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAS(String value) {
                this.as = value;
            }

            /**
             * Gets the value of the bs property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBS() {
                return bs;
            }

            /**
             * Sets the value of the bs property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBS(String value) {
                this.bs = value;
            }

            /**
             * Gets the value of the cs property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCS() {
                return cs;
            }

            /**
             * Sets the value of the cs property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCS(String value) {
                this.cs = value;
            }

            /**
             * Gets the value of the ds property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDS() {
                return ds;
            }

            /**
             * Sets the value of the ds property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDS(String value) {
                this.ds = value;
            }

            /**
             * Gets the value of the es property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getES() {
                return es;
            }

            /**
             * Sets the value of the es property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setES(String value) {
                this.es = value;
            }

        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "as",
            "bs",
            "cs",
            "ds",
            "es"
        })
        public static class SSS {

            @XmlElement(name = "AS")
            protected String as;
            @XmlElement(name = "BS")
            protected String bs;
            @XmlElement(name = "CS")
            protected String cs;
            @XmlElement(name = "DS")
            protected String ds;
            @XmlElement(name = "ES")
            protected String es;

            /**
             * Gets the value of the as property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAS() {
                return as;
            }

            /**
             * Sets the value of the as property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAS(String value) {
                this.as = value;
            }

            /**
             * Gets the value of the bs property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBS() {
                return bs;
            }

            /**
             * Sets the value of the bs property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBS(String value) {
                this.bs = value;
            }

            /**
             * Gets the value of the cs property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCS() {
                return cs;
            }

            /**
             * Sets the value of the cs property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCS(String value) {
                this.cs = value;
            }

            /**
             * Gets the value of the ds property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDS() {
                return ds;
            }

            /**
             * Sets the value of the ds property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDS(String value) {
                this.ds = value;
            }

            /**
             * Gets the value of the es property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getES() {
                return es;
            }

            /**
             * Sets the value of the es property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setES(String value) {
                this.es = value;
            }

        }

    }

}
