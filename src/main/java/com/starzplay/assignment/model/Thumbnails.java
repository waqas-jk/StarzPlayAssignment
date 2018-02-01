
package com.starzplay.assignment.model;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "thumb-615x1536",
    "thumb-613x1536",
    "thumb-677x474",
    "thumb-614x1536"
})
public class Thumbnails {

    @JsonProperty("thumb-615x1536")
    private Thumb615x1536 thumb615x1536;
    @JsonProperty("thumb-613x1536")
    private Thumb613x1536 thumb613x1536;
    @JsonProperty("thumb-677x474")
    private Thumb677x474 thumb677x474;
    @JsonProperty("thumb-614x1536")
    private Thumb614x1536 thumb614x1536;

    @JsonProperty("thumb-615x1536")
    public Thumb615x1536 getThumb615x1536() {
        return thumb615x1536;
    }

    @JsonProperty("thumb-615x1536")
    public void setThumb615x1536(Thumb615x1536 thumb615x1536) {
        this.thumb615x1536 = thumb615x1536;
    }

    @JsonProperty("thumb-613x1536")
    public Thumb613x1536 getThumb613x1536() {
        return thumb613x1536;
    }

    @JsonProperty("thumb-613x1536")
    public void setThumb613x1536(Thumb613x1536 thumb613x1536) {
        this.thumb613x1536 = thumb613x1536;
    }

    @JsonProperty("thumb-677x474")
    public Thumb677x474 getThumb677x474() {
        return thumb677x474;
    }

    @JsonProperty("thumb-677x474")
    public void setThumb677x474(Thumb677x474 thumb677x474) {
        this.thumb677x474 = thumb677x474;
    }

    @JsonProperty("thumb-614x1536")
    public Thumb614x1536 getThumb614x1536() {
        return thumb614x1536;
    }

    @JsonProperty("thumb-614x1536")
    public void setThumb614x1536(Thumb614x1536 thumb614x1536) {
        this.thumb614x1536 = thumb614x1536;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("thumb615x1536", thumb615x1536).append("thumb613x1536", thumb613x1536).append("thumb677x474", thumb677x474).append("thumb614x1536", thumb614x1536).toString();
    }

}
