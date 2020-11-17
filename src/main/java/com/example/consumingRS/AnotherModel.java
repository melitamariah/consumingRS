package com.example.consumingRS;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

//Everything below is JSON property and show the only variable I am declaring
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnotherModel {

        public String status;
        public String copyright;
        public String section;
        public String last_updated;
        public long num_results;
        public ArrayList<Result> results;

//empty constructor
        public AnotherModel() {

        }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public void setNum_results(long num_results) {
        this.num_results = num_results;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }

    public String getStatus() {
            return status;
        }

        public String getCopyright() {
            return copyright;
        }

        public String getSection() {
            return section;
        }

        public String getLast_updated() {
            return last_updated;
        }

        public long getNum_results() {
            return num_results;
        }

        public List<Result> getResults() {
            return results;
        }

        //to + enter =
    @Override
    public String toString() {
        return "AnotherModel{" +
                "status='" + status + '\'' +
                ", copyright='" + copyright + '\'' +
                ", section='" + section + '\'' +
                ", last_updated='" + last_updated + '\'' +
                ", num_results=" + num_results +
                ", results=" + results +
                '}';
    }
}







