
package com.starzplay.assignment.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bitrate",
    "duration",
    "format",
    "height",
    "language",
    "width",
    "id",
    "guid",
    "assetTypeIds",
    "assetTypes",
    "downloadUrl",
    "releases",
    "serverId",
    "streamingUrl",
    "protectionScheme"
})
public class Content {

    @JsonProperty("bitrate")
    private Long bitrate;
    @JsonProperty("duration")
    private Float duration;
    @JsonProperty("format")
    private String format;
    @JsonProperty("height")
    private Long height;
    @JsonProperty("language")
    private String language;
    @JsonProperty("width")
    private Long width;
    @JsonProperty("id")
    private String id;
    @JsonProperty("guid")
    private String guid;
    @JsonProperty("assetTypeIds")
    private List<String> assetTypeIds = null;
    @JsonProperty("assetTypes")
    private List<String> assetTypes = null;
    @JsonProperty("downloadUrl")
    private String downloadUrl;
    @JsonProperty("releases")
    private List<Release> releases = null;
    @JsonProperty("serverId")
    private String serverId;
    @JsonProperty("streamingUrl")
    private String streamingUrl;
    @JsonProperty("protectionScheme")
    private String protectionScheme;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bitrate")
    public Long getBitrate() {
        return bitrate;
    }

    @JsonProperty("bitrate")
    public void setBitrate(Long bitrate) {
        this.bitrate = bitrate;
    }

    @JsonProperty("duration")
    public Float getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Float duration) {
        this.duration = duration;
    }

    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    @JsonProperty("height")
    public Long getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Long height) {
        this.height = height;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("width")
    public Long getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Long width) {
        this.width = width;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("guid")
    public String getGuid() {
        return guid;
    }

    @JsonProperty("guid")
    public void setGuid(String guid) {
        this.guid = guid;
    }

    @JsonProperty("assetTypeIds")
    public List<String> getAssetTypeIds() {
        return assetTypeIds;
    }

    @JsonProperty("assetTypeIds")
    public void setAssetTypeIds(List<String> assetTypeIds) {
        this.assetTypeIds = assetTypeIds;
    }

    @JsonProperty("assetTypes")
    public List<String> getAssetTypes() {
        return assetTypes;
    }

    @JsonProperty("assetTypes")
    public void setAssetTypes(List<String> assetTypes) {
        this.assetTypes = assetTypes;
    }

    @JsonProperty("downloadUrl")
    public String getDownloadUrl() {
        return downloadUrl;
    }

    @JsonProperty("downloadUrl")
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @JsonProperty("releases")
    public List<Release> getReleases() {
        return releases;
    }

    @JsonProperty("releases")
    public void setReleases(List<Release> releases) {
        this.releases = releases;
    }

    @JsonProperty("serverId")
    public String getServerId() {
        return serverId;
    }

    @JsonProperty("serverId")
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    @JsonProperty("streamingUrl")
    public String getStreamingUrl() {
        return streamingUrl;
    }

    @JsonProperty("streamingUrl")
    public void setStreamingUrl(String streamingUrl) {
        this.streamingUrl = streamingUrl;
    }

    @JsonProperty("protectionScheme")
    public String getProtectionScheme() {
        return protectionScheme;
    }

    @JsonProperty("protectionScheme")
    public void setProtectionScheme(String protectionScheme) {
        this.protectionScheme = protectionScheme;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bitrate", bitrate).append("duration", duration).append("format", format).append("height", height).append("language", language).append("width", width).append("id", id).append("guid", guid).append("assetTypeIds", assetTypeIds).append("assetTypes", assetTypes).append("downloadUrl", downloadUrl).append("releases", releases).append("serverId", serverId).append("streamingUrl", streamingUrl).append("protectionScheme", protectionScheme).toString();
    }

}
