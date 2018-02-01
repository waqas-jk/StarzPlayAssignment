
package com.starzplay.assignment.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("characterName", characterName).append("creditType", creditType).append("isInactive", isInactive).append("order", order).append("personId", personId).append("personName", personName).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(creditType).append(characterName).append(order).append(isInactive).append(additionalProperties).append(personId).append(personName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Credit) == false) {
            return false;
        }
        Credit rhs = ((Credit) other);
        return new EqualsBuilder().append(creditType, rhs.creditType).append(characterName, rhs.characterName).append(order, rhs.order).append(isInactive, rhs.isInactive).append(additionalProperties, rhs.additionalProperties).append(personId, rhs.personId).append(personName, rhs.personName).isEquals();
    }

}
