
package com.starzplay.assignment.model;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ar"
})
public class LongDescriptionLocalized {

    @JsonProperty("ar")
    private String ar;

    @JsonProperty("ar")
    public String getAr() {
        return ar;
    }

    @JsonProperty("ar")
    public void setAr(String ar) {
        this.ar = ar;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ar", ar).toString();
    }

}
