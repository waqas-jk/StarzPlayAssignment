
package com.starzplay.assignment.model;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "characterName",
    "creditType",
    "isInactive",
    "order",
    "personId",
    "personName"
})
public class Credit {

    @JsonProperty("characterName")
    private String characterName;
    @JsonProperty("creditType")
    private String creditType;
    @JsonProperty("isInactive")
    private Boolean isInactive;
    @JsonProperty("order")
    private Long order;
    @JsonProperty("personId")
    private String personId;
    @JsonProperty("personName")
    private String personName;

    @JsonProperty("characterName")
    public String getCharacterName() {
        return characterName;
    }

    @JsonProperty("characterName")
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    @JsonProperty("creditType")
    public String getCreditType() {
        return creditType;
    }

    @JsonProperty("creditType")
    public void setCreditType(String creditType) {
        this.creditType = creditType;
    }

    @JsonProperty("isInactive")
    public Boolean getIsInactive() {
        return isInactive;
    }

    @JsonProperty("isInactive")
    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    @JsonProperty("order")
    public Long getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(Long order) {
        this.order = order;
    }

    @JsonProperty("personId")
    public String getPersonId() {
        return personId;
    }

    @JsonProperty("personId")
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @JsonProperty("personName")
    public String getPersonName() {
        return personName;
    }

    @JsonProperty("personName")
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("characterName", characterName).append("creditType", creditType).append("isInactive", isInactive).append("order", order).append("personId", personId).append("personName", personName).toString();
    }

}
