package com.example.consumingRS;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {

    public String section;
    public String subsection;
    public String title;

    // use this annotation during deserialization when the property
    // names of the JSON and the field names of the Java object do not match
    @JsonProperty("abstract")
    public String abstracted;

    public String url;
    public String uri;
    public String byline;
    public String item_type;
    public String updated_date;
    public String created_date;
    public String published_date;
    public String material_type_facet;
    public String kicker;

    public String[] des_facet;
    public String[] org_facet;
    public String[] per_facet;

    public ArrayList<Multimedia> multimedia;


    public Result(String section, String subsection, String title,
                  String abstracted, String url, String uri,
                  String byline, String item_type, String updated_date,
                  String created_date, String published_date,
                  String material_type_facet, String kicker, String[] des_facet,
                  String[] org_facet, String[] per_facet, ArrayList<Multimedia> multimedia) {

        this.section = section;
        this.subsection = subsection;
        this.title = title;
        this.abstracted = abstracted;
        this.url = url;
        this.uri = uri;
        this.byline = byline;
        this.item_type = item_type;
        this.updated_date = updated_date;
        this.created_date = created_date;
        this.published_date = published_date;
        this.material_type_facet = material_type_facet;
        this.kicker = kicker;
        this.des_facet = des_facet;
        this.org_facet = org_facet;
        this.per_facet = per_facet;
        this.multimedia = multimedia;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setSubsection(String subsection) {
        this.subsection = subsection;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAbstracted(String abstracted) {
        this.abstracted = abstracted;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public void setMaterial_type_facet(String material_type_facet) {
        this.material_type_facet = material_type_facet;
    }

    public void setKicker(String kicker) {
        this.kicker = kicker;
    }

    public void setDes_facet(String[] des_facet) {
        this.des_facet = des_facet;
    }

    public void setOrg_facet(String[] org_facet) {
        this.org_facet = org_facet;
    }

    public void setPer_facet(String[] per_facet) {
        this.per_facet = per_facet;
    }

    public void setMultimedia(ArrayList<Multimedia> multimedia) {
        this.multimedia = multimedia;
    }

    public String getSection() {
        return section;
    }

    public String getSubsection() {
        return subsection;
    }

    public String getTitle() {
        return title;
    }

    public String getAbstracted() {
        return abstracted;
    }

    public String getUrl() {
        return url;
    }

    public String getUri() {
        return uri;
    }

    public String getByline() {
        return byline;
    }

    public String getItem_type() {
        return item_type;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public String getCreated_date() {
        return created_date;
    }

    public String getPublished_date() {
        return published_date;
    }

    public String getMaterial_type_facet() {
        return material_type_facet;
    }

    public String getKicker() {
        return kicker;
    }

    public String[] getDes_facet() {
        return des_facet;
    }

    public String[] getOrg_facet() {
        return org_facet;
    }

    public String[] getPer_facet() {
        return per_facet;
    }

    public List<Multimedia> getMultimedia() {
        return multimedia;
    }

    public static class Multimedia {

        String url;
        String format;
        long height;
        long width;
        String type;
        String subtype;
        String caption;
        String copyright;

        //nest class needs this too
        @JsonIgnoreProperties(ignoreUnknown = true)
        public Multimedia() {
        }

        @Override
        public String toString() {
            return "Multimedia{" +
                    "url='" + url + '\'' +
                    ", format='" + format + '\'' +
                    ", height=" + height +
                    ", width=" + width +
                    ", type='" + type + '\'' +
                    ", subtype='" + subtype + '\'' +
                    ", caption='" + caption + '\'' +
                    ", copyright='" + copyright + '\'' +
                    '}';
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public void setHeight(long height) {
            this.height = height;
        }

        public void setWidth(long width) {
            this.width = width;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public void setCopyright(String copyright) {
            this.copyright = copyright;
        }

        public String getUrl() {
            return url;
        }

        public String getFormat() {
            return format;
        }

        public long getHeight() {
            return height;
        }

        public long getWidth() {
            return width;
        }

        public String getType() {
            return type;
        }

        public String getSubtype() {
            return subtype;
        }

        public String getCaption() {
            return caption;
        }

        public String getCopyright() {
            return copyright;
        }
    }

    //creating order and helping to identify keywords and values they hold
    @Override
    public String toString() {
        return "Result{" +
                "section='" + section + '\'' +
                ", subsection='" + subsection + '\'' +
                ", title='" + title + '\'' +
                ", abstracted='" + abstracted + '\'' +
                ", url='" + url + '\'' +
                ", uri='" + uri + '\'' +
                ", byline='" + byline + '\'' +
                ", item_type='" + item_type + '\'' +
                ", updated_date='" + updated_date + '\'' +
                ", created_date='" + created_date + '\'' +
                ", published_date='" + published_date + '\'' +
                ", material_type_facet='" + material_type_facet + '\'' +
                ", kicker='" + kicker + '\'' +
                ", des_facet=" + Arrays.toString(des_facet) +
                ", org_facet=" + Arrays.toString(org_facet) +
                ", per_facet=" + Arrays.toString(per_facet) +
                ", multimedia=" + multimedia +
                '}';
    }
}


