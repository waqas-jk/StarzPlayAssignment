
package com.starzplay.assignment.model;

import java.util.HashMap;
import java.util.List;
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
    "id",
    "guid",
    "updated",
    "title",
    "description",
    "added",
    "approved",
    "credits",
    "descriptionLocalized",
    "displayGenre",
    "editorialRating",
    "imageMediaIds",
    "isAdult",
    "languages",
    "longDescription",
    "longDescriptionLocalized",
    "programType",
    "ratings",
    "seriesEpisodeNumber",
    "seriesId",
    "shortDescription",
    "shortDescriptionLocalized",
    "tagIds",
    "tags",
    "thumbnails",
    "titleLocalized",
    "tvSeasonEpisodeNumber",
    "tvSeasonId",
    "tvSeasonNumber",
    "year",
    "media",
    "peg$ExclusiveFrench",
    "peg$arAgeRating",
    "peg$arContentRating",
    "peg$availableInSection",
    "peg$contentClassification",
    "peg$contractName",
    "peg$countryOfOrigin",
    "peg$priorityLevel",
    "peg$priorityLevelActionandAdventure",
    "peg$priorityLevelArabic",
    "peg$priorityLevelChildrenandFamily",
    "peg$priorityLevelComedy",
    "peg$priorityLevelDisney",
    "peg$priorityLevelDisneyKids",
    "peg$priorityLevelDrama",
    "peg$priorityLevelKids",
    "peg$priorityLevelKidsAction",
    "peg$priorityLevelKidsFunandAdventure",
    "peg$priorityLevelKidsMagicandDreams",
    "peg$priorityLevelKidsPreschool",
    "peg$priorityLevelRomance",
    "peg$priorityLevelThriller",
    "peg$productCode",
    "peg$programMediaAvailability",
    "peg$testDefaultValue"
})
public class Entry {

    @JsonProperty("id")
    private String id;
    @JsonProperty("guid")
    private String guid;
    @JsonProperty("updated")
    private Long updated;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("added")
    private Long added;
    @JsonProperty("approved")
    private Boolean approved;
    @JsonProperty("credits")
    private List<Credit> credits = null;
    @JsonProperty("descriptionLocalized")
    private DescriptionLocalized descriptionLocalized;
    @JsonProperty("displayGenre")
    private Object displayGenre;
    @JsonProperty("editorialRating")
    private Object editorialRating;
    @JsonProperty("imageMediaIds")
    private List<ImageMediaId> imageMediaIds = null;
    @JsonProperty("isAdult")
    private Object isAdult;
    @JsonProperty("languages")
    private List<String> languages = null;
    @JsonProperty("longDescription")
    private String longDescription;
    @JsonProperty("longDescriptionLocalized")
    private LongDescriptionLocalized longDescriptionLocalized;
    @JsonProperty("programType")
    private String programType;
    @JsonProperty("ratings")
    private List<Object> ratings = null;
    @JsonProperty("seriesEpisodeNumber")
    private Object seriesEpisodeNumber;
    @JsonProperty("seriesId")
    private Object seriesId;
    @JsonProperty("shortDescription")
    private String shortDescription;
    @JsonProperty("shortDescriptionLocalized")
    private ShortDescriptionLocalized shortDescriptionLocalized;
    @JsonProperty("tagIds")
    private List<String> tagIds = null;
    @JsonProperty("tags")
    private List<Tag> tags = null;
    @JsonProperty("thumbnails")
    private Thumbnails thumbnails;
    @JsonProperty("titleLocalized")
    private TitleLocalized titleLocalized;
    @JsonProperty("tvSeasonEpisodeNumber")
    private Object tvSeasonEpisodeNumber;
    @JsonProperty("tvSeasonId")
    private Object tvSeasonId;
    @JsonProperty("tvSeasonNumber")
    private Object tvSeasonNumber;
    @JsonProperty("year")
    private Long year;
    @JsonProperty("media")
    private List<Medium> media = null;
    @JsonProperty("peg$ExclusiveFrench")
    private String peg$ExclusiveFrench;
    @JsonProperty("peg$arAgeRating")
    private Long peg$arAgeRating;
    @JsonProperty("peg$arContentRating")
    private String peg$arContentRating;
    @JsonProperty("peg$availableInSection")
    private String peg$availableInSection;
    @JsonProperty("peg$contentClassification")
    private String peg$contentClassification;
    @JsonProperty("peg$contractName")
    private String peg$contractName;
    @JsonProperty("peg$countryOfOrigin")
    private String peg$countryOfOrigin;
    @JsonProperty("peg$priorityLevel")
    private String peg$priorityLevel;
    @JsonProperty("peg$priorityLevelActionandAdventure")
    private String peg$priorityLevelActionandAdventure;
    @JsonProperty("peg$priorityLevelArabic")
    private String peg$priorityLevelArabic;
    @JsonProperty("peg$priorityLevelChildrenandFamily")
    private String peg$priorityLevelChildrenandFamily;
    @JsonProperty("peg$priorityLevelComedy")
    private String peg$priorityLevelComedy;
    @JsonProperty("peg$priorityLevelDisney")
    private String peg$priorityLevelDisney;
    @JsonProperty("peg$priorityLevelDisneyKids")
    private String peg$priorityLevelDisneyKids;
    @JsonProperty("peg$priorityLevelDrama")
    private String peg$priorityLevelDrama;
    @JsonProperty("peg$priorityLevelKids")
    private String peg$priorityLevelKids;
    @JsonProperty("peg$priorityLevelKidsAction")
    private String peg$priorityLevelKidsAction;
    @JsonProperty("peg$priorityLevelKidsFunandAdventure")
    private String peg$priorityLevelKidsFunandAdventure;
    @JsonProperty("peg$priorityLevelKidsMagicandDreams")
    private String peg$priorityLevelKidsMagicandDreams;
    @JsonProperty("peg$priorityLevelKidsPreschool")
    private String peg$priorityLevelKidsPreschool;
    @JsonProperty("peg$priorityLevelRomance")
    private String peg$priorityLevelRomance;
    @JsonProperty("peg$priorityLevelThriller")
    private String peg$priorityLevelThriller;
    @JsonProperty("peg$productCode")
    private String peg$productCode;
    @JsonProperty("peg$programMediaAvailability")
    private String peg$programMediaAvailability;
    @JsonProperty("peg$testDefaultValue")
    private String peg$testDefaultValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("updated")
    public Long getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("added")
    public Long getAdded() {
        return added;
    }

    @JsonProperty("added")
    public void setAdded(Long added) {
        this.added = added;
    }

    @JsonProperty("approved")
    public Boolean getApproved() {
        return approved;
    }

    @JsonProperty("approved")
    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    @JsonProperty("credits")
    public List<Credit> getCredits() {
        return credits;
    }

    @JsonProperty("credits")
    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }

    @JsonProperty("descriptionLocalized")
    public DescriptionLocalized getDescriptionLocalized() {
        return descriptionLocalized;
    }

    @JsonProperty("descriptionLocalized")
    public void setDescriptionLocalized(DescriptionLocalized descriptionLocalized) {
        this.descriptionLocalized = descriptionLocalized;
    }

    @JsonProperty("displayGenre")
    public Object getDisplayGenre() {
        return displayGenre;
    }

    @JsonProperty("displayGenre")
    public void setDisplayGenre(Object displayGenre) {
        this.displayGenre = displayGenre;
    }

    @JsonProperty("editorialRating")
    public Object getEditorialRating() {
        return editorialRating;
    }

    @JsonProperty("editorialRating")
    public void setEditorialRating(Object editorialRating) {
        this.editorialRating = editorialRating;
    }

    @JsonProperty("imageMediaIds")
    public List<ImageMediaId> getImageMediaIds() {
        return imageMediaIds;
    }

    @JsonProperty("imageMediaIds")
    public void setImageMediaIds(List<ImageMediaId> imageMediaIds) {
        this.imageMediaIds = imageMediaIds;
    }

    @JsonProperty("isAdult")
    public Object getIsAdult() {
        return isAdult;
    }

    @JsonProperty("isAdult")
    public void setIsAdult(Object isAdult) {
        this.isAdult = isAdult;
    }

    @JsonProperty("languages")
    public List<String> getLanguages() {
        return languages;
    }

    @JsonProperty("languages")
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    @JsonProperty("longDescription")
    public String getLongDescription() {
        return longDescription;
    }

    @JsonProperty("longDescription")
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @JsonProperty("longDescriptionLocalized")
    public LongDescriptionLocalized getLongDescriptionLocalized() {
        return longDescriptionLocalized;
    }

    @JsonProperty("longDescriptionLocalized")
    public void setLongDescriptionLocalized(LongDescriptionLocalized longDescriptionLocalized) {
        this.longDescriptionLocalized = longDescriptionLocalized;
    }

    @JsonProperty("programType")
    public String getProgramType() {
        return programType;
    }

    @JsonProperty("programType")
    public void setProgramType(String programType) {
        this.programType = programType;
    }

    @JsonProperty("ratings")
    public List<Object> getRatings() {
        return ratings;
    }

    @JsonProperty("ratings")
    public void setRatings(List<Object> ratings) {
        this.ratings = ratings;
    }

    @JsonProperty("seriesEpisodeNumber")
    public Object getSeriesEpisodeNumber() {
        return seriesEpisodeNumber;
    }

    @JsonProperty("seriesEpisodeNumber")
    public void setSeriesEpisodeNumber(Object seriesEpisodeNumber) {
        this.seriesEpisodeNumber = seriesEpisodeNumber;
    }

    @JsonProperty("seriesId")
    public Object getSeriesId() {
        return seriesId;
    }

    @JsonProperty("seriesId")
    public void setSeriesId(Object seriesId) {
        this.seriesId = seriesId;
    }

    @JsonProperty("shortDescription")
    public String getShortDescription() {
        return shortDescription;
    }

    @JsonProperty("shortDescription")
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @JsonProperty("shortDescriptionLocalized")
    public ShortDescriptionLocalized getShortDescriptionLocalized() {
        return shortDescriptionLocalized;
    }

    @JsonProperty("shortDescriptionLocalized")
    public void setShortDescriptionLocalized(ShortDescriptionLocalized shortDescriptionLocalized) {
        this.shortDescriptionLocalized = shortDescriptionLocalized;
    }

    @JsonProperty("tagIds")
    public List<String> getTagIds() {
        return tagIds;
    }

    @JsonProperty("tagIds")
    public void setTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @JsonProperty("thumbnails")
    public Thumbnails getThumbnails() {
        return thumbnails;
    }

    @JsonProperty("thumbnails")
    public void setThumbnails(Thumbnails thumbnails) {
        this.thumbnails = thumbnails;
    }

    @JsonProperty("titleLocalized")
    public TitleLocalized getTitleLocalized() {
        return titleLocalized;
    }

    @JsonProperty("titleLocalized")
    public void setTitleLocalized(TitleLocalized titleLocalized) {
        this.titleLocalized = titleLocalized;
    }

    @JsonProperty("tvSeasonEpisodeNumber")
    public Object getTvSeasonEpisodeNumber() {
        return tvSeasonEpisodeNumber;
    }

    @JsonProperty("tvSeasonEpisodeNumber")
    public void setTvSeasonEpisodeNumber(Object tvSeasonEpisodeNumber) {
        this.tvSeasonEpisodeNumber = tvSeasonEpisodeNumber;
    }

    @JsonProperty("tvSeasonId")
    public Object getTvSeasonId() {
        return tvSeasonId;
    }

    @JsonProperty("tvSeasonId")
    public void setTvSeasonId(Object tvSeasonId) {
        this.tvSeasonId = tvSeasonId;
    }

    @JsonProperty("tvSeasonNumber")
    public Object getTvSeasonNumber() {
        return tvSeasonNumber;
    }

    @JsonProperty("tvSeasonNumber")
    public void setTvSeasonNumber(Object tvSeasonNumber) {
        this.tvSeasonNumber = tvSeasonNumber;
    }

    @JsonProperty("year")
    public Long getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(Long year) {
        this.year = year;
    }

    @JsonProperty("media")
    public List<Medium> getMedia() {
        return media;
    }

    @JsonProperty("media")
    public void setMedia(List<Medium> media) {
        this.media = media;
    }

    @JsonProperty("peg$ExclusiveFrench")
    public String getPeg$ExclusiveFrench() {
        return peg$ExclusiveFrench;
    }

    @JsonProperty("peg$ExclusiveFrench")
    public void setPeg$ExclusiveFrench(String peg$ExclusiveFrench) {
        this.peg$ExclusiveFrench = peg$ExclusiveFrench;
    }

    @JsonProperty("peg$arAgeRating")
    public Long getPeg$arAgeRating() {
        return peg$arAgeRating;
    }

    @JsonProperty("peg$arAgeRating")
    public void setPeg$arAgeRating(Long peg$arAgeRating) {
        this.peg$arAgeRating = peg$arAgeRating;
    }

    @JsonProperty("peg$arContentRating")
    public String getPeg$arContentRating() {
        return peg$arContentRating;
    }

    @JsonProperty("peg$arContentRating")
    public void setPeg$arContentRating(String peg$arContentRating) {
        this.peg$arContentRating = peg$arContentRating;
    }

    @JsonProperty("peg$availableInSection")
    public String getPeg$availableInSection() {
        return peg$availableInSection;
    }

    @JsonProperty("peg$availableInSection")
    public void setPeg$availableInSection(String peg$availableInSection) {
        this.peg$availableInSection = peg$availableInSection;
    }

    @JsonProperty("peg$contentClassification")
    public String getPeg$contentClassification() {
        return peg$contentClassification;
    }

    @JsonProperty("peg$contentClassification")
    public void setPeg$contentClassification(String peg$contentClassification) {
        this.peg$contentClassification = peg$contentClassification;
    }

    @JsonProperty("peg$contractName")
    public String getPeg$contractName() {
        return peg$contractName;
    }

    @JsonProperty("peg$contractName")
    public void setPeg$contractName(String peg$contractName) {
        this.peg$contractName = peg$contractName;
    }

    @JsonProperty("peg$countryOfOrigin")
    public String getPeg$countryOfOrigin() {
        return peg$countryOfOrigin;
    }

    @JsonProperty("peg$countryOfOrigin")
    public void setPeg$countryOfOrigin(String peg$countryOfOrigin) {
        this.peg$countryOfOrigin = peg$countryOfOrigin;
    }

    @JsonProperty("peg$priorityLevel")
    public String getPeg$priorityLevel() {
        return peg$priorityLevel;
    }

    @JsonProperty("peg$priorityLevel")
    public void setPeg$priorityLevel(String peg$priorityLevel) {
        this.peg$priorityLevel = peg$priorityLevel;
    }

    @JsonProperty("peg$priorityLevelActionandAdventure")
    public String getPeg$priorityLevelActionandAdventure() {
        return peg$priorityLevelActionandAdventure;
    }

    @JsonProperty("peg$priorityLevelActionandAdventure")
    public void setPeg$priorityLevelActionandAdventure(String peg$priorityLevelActionandAdventure) {
        this.peg$priorityLevelActionandAdventure = peg$priorityLevelActionandAdventure;
    }

    @JsonProperty("peg$priorityLevelArabic")
    public String getPeg$priorityLevelArabic() {
        return peg$priorityLevelArabic;
    }

    @JsonProperty("peg$priorityLevelArabic")
    public void setPeg$priorityLevelArabic(String peg$priorityLevelArabic) {
        this.peg$priorityLevelArabic = peg$priorityLevelArabic;
    }

    @JsonProperty("peg$priorityLevelChildrenandFamily")
    public String getPeg$priorityLevelChildrenandFamily() {
        return peg$priorityLevelChildrenandFamily;
    }

    @JsonProperty("peg$priorityLevelChildrenandFamily")
    public void setPeg$priorityLevelChildrenandFamily(String peg$priorityLevelChildrenandFamily) {
        this.peg$priorityLevelChildrenandFamily = peg$priorityLevelChildrenandFamily;
    }

    @JsonProperty("peg$priorityLevelComedy")
    public String getPeg$priorityLevelComedy() {
        return peg$priorityLevelComedy;
    }

    @JsonProperty("peg$priorityLevelComedy")
    public void setPeg$priorityLevelComedy(String peg$priorityLevelComedy) {
        this.peg$priorityLevelComedy = peg$priorityLevelComedy;
    }

    @JsonProperty("peg$priorityLevelDisney")
    public String getPeg$priorityLevelDisney() {
        return peg$priorityLevelDisney;
    }

    @JsonProperty("peg$priorityLevelDisney")
    public void setPeg$priorityLevelDisney(String peg$priorityLevelDisney) {
        this.peg$priorityLevelDisney = peg$priorityLevelDisney;
    }

    @JsonProperty("peg$priorityLevelDisneyKids")
    public String getPeg$priorityLevelDisneyKids() {
        return peg$priorityLevelDisneyKids;
    }

    @JsonProperty("peg$priorityLevelDisneyKids")
    public void setPeg$priorityLevelDisneyKids(String peg$priorityLevelDisneyKids) {
        this.peg$priorityLevelDisneyKids = peg$priorityLevelDisneyKids;
    }

    @JsonProperty("peg$priorityLevelDrama")
    public String getPeg$priorityLevelDrama() {
        return peg$priorityLevelDrama;
    }

    @JsonProperty("peg$priorityLevelDrama")
    public void setPeg$priorityLevelDrama(String peg$priorityLevelDrama) {
        this.peg$priorityLevelDrama = peg$priorityLevelDrama;
    }

    @JsonProperty("peg$priorityLevelKids")
    public String getPeg$priorityLevelKids() {
        return peg$priorityLevelKids;
    }

    @JsonProperty("peg$priorityLevelKids")
    public void setPeg$priorityLevelKids(String peg$priorityLevelKids) {
        this.peg$priorityLevelKids = peg$priorityLevelKids;
    }

    @JsonProperty("peg$priorityLevelKidsAction")
    public String getPeg$priorityLevelKidsAction() {
        return peg$priorityLevelKidsAction;
    }

    @JsonProperty("peg$priorityLevelKidsAction")
    public void setPeg$priorityLevelKidsAction(String peg$priorityLevelKidsAction) {
        this.peg$priorityLevelKidsAction = peg$priorityLevelKidsAction;
    }

    @JsonProperty("peg$priorityLevelKidsFunandAdventure")
    public String getPeg$priorityLevelKidsFunandAdventure() {
        return peg$priorityLevelKidsFunandAdventure;
    }

    @JsonProperty("peg$priorityLevelKidsFunandAdventure")
    public void setPeg$priorityLevelKidsFunandAdventure(String peg$priorityLevelKidsFunandAdventure) {
        this.peg$priorityLevelKidsFunandAdventure = peg$priorityLevelKidsFunandAdventure;
    }

    @JsonProperty("peg$priorityLevelKidsMagicandDreams")
    public String getPeg$priorityLevelKidsMagicandDreams() {
        return peg$priorityLevelKidsMagicandDreams;
    }

    @JsonProperty("peg$priorityLevelKidsMagicandDreams")
    public void setPeg$priorityLevelKidsMagicandDreams(String peg$priorityLevelKidsMagicandDreams) {
        this.peg$priorityLevelKidsMagicandDreams = peg$priorityLevelKidsMagicandDreams;
    }

    @JsonProperty("peg$priorityLevelKidsPreschool")
    public String getPeg$priorityLevelKidsPreschool() {
        return peg$priorityLevelKidsPreschool;
    }

    @JsonProperty("peg$priorityLevelKidsPreschool")
    public void setPeg$priorityLevelKidsPreschool(String peg$priorityLevelKidsPreschool) {
        this.peg$priorityLevelKidsPreschool = peg$priorityLevelKidsPreschool;
    }

    @JsonProperty("peg$priorityLevelRomance")
    public String getPeg$priorityLevelRomance() {
        return peg$priorityLevelRomance;
    }

    @JsonProperty("peg$priorityLevelRomance")
    public void setPeg$priorityLevelRomance(String peg$priorityLevelRomance) {
        this.peg$priorityLevelRomance = peg$priorityLevelRomance;
    }

    @JsonProperty("peg$priorityLevelThriller")
    public String getPeg$priorityLevelThriller() {
        return peg$priorityLevelThriller;
    }

    @JsonProperty("peg$priorityLevelThriller")
    public void setPeg$priorityLevelThriller(String peg$priorityLevelThriller) {
        this.peg$priorityLevelThriller = peg$priorityLevelThriller;
    }

    @JsonProperty("peg$productCode")
    public String getPeg$productCode() {
        return peg$productCode;
    }

    @JsonProperty("peg$productCode")
    public void setPeg$productCode(String peg$productCode) {
        this.peg$productCode = peg$productCode;
    }

    @JsonProperty("peg$programMediaAvailability")
    public String getPeg$programMediaAvailability() {
        return peg$programMediaAvailability;
    }

    @JsonProperty("peg$programMediaAvailability")
    public void setPeg$programMediaAvailability(String peg$programMediaAvailability) {
        this.peg$programMediaAvailability = peg$programMediaAvailability;
    }

    @JsonProperty("peg$testDefaultValue")
    public String getPeg$testDefaultValue() {
        return peg$testDefaultValue;
    }

    @JsonProperty("peg$testDefaultValue")
    public void setPeg$testDefaultValue(String peg$testDefaultValue) {
        this.peg$testDefaultValue = peg$testDefaultValue;
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
        return new ToStringBuilder(this).append("id", id).append("guid", guid).append("updated", updated).append("title", title).append("description", description).append("added", added).append("approved", approved).append("credits", credits).append("descriptionLocalized", descriptionLocalized).append("displayGenre", displayGenre).append("editorialRating", editorialRating).append("imageMediaIds", imageMediaIds).append("isAdult", isAdult).append("languages", languages).append("longDescription", longDescription).append("longDescriptionLocalized", longDescriptionLocalized).append("programType", programType).append("ratings", ratings).append("seriesEpisodeNumber", seriesEpisodeNumber).append("seriesId", seriesId).append("shortDescription", shortDescription).append("shortDescriptionLocalized", shortDescriptionLocalized).append("tagIds", tagIds).append("tags", tags).append("thumbnails", thumbnails).append("titleLocalized", titleLocalized).append("tvSeasonEpisodeNumber", tvSeasonEpisodeNumber).append("tvSeasonId", tvSeasonId).append("tvSeasonNumber", tvSeasonNumber).append("year", year).append("media", media).append("peg$ExclusiveFrench", peg$ExclusiveFrench).append("peg$arAgeRating", peg$arAgeRating).append("peg$arContentRating", peg$arContentRating).append("peg$availableInSection", peg$availableInSection).append("peg$contentClassification", peg$contentClassification).append("peg$contractName", peg$contractName).append("peg$countryOfOrigin", peg$countryOfOrigin).append("peg$priorityLevel", peg$priorityLevel).append("peg$priorityLevelActionandAdventure", peg$priorityLevelActionandAdventure).append("peg$priorityLevelArabic", peg$priorityLevelArabic).append("peg$priorityLevelChildrenandFamily", peg$priorityLevelChildrenandFamily).append("peg$priorityLevelComedy", peg$priorityLevelComedy).append("peg$priorityLevelDisney", peg$priorityLevelDisney).append("peg$priorityLevelDisneyKids", peg$priorityLevelDisneyKids).append("peg$priorityLevelDrama", peg$priorityLevelDrama).append("peg$priorityLevelKids", peg$priorityLevelKids).append("peg$priorityLevelKidsAction", peg$priorityLevelKidsAction).append("peg$priorityLevelKidsFunandAdventure", peg$priorityLevelKidsFunandAdventure).append("peg$priorityLevelKidsMagicandDreams", peg$priorityLevelKidsMagicandDreams).append("peg$priorityLevelKidsPreschool", peg$priorityLevelKidsPreschool).append("peg$priorityLevelRomance", peg$priorityLevelRomance).append("peg$priorityLevelThriller", peg$priorityLevelThriller).append("peg$productCode", peg$productCode).append("peg$programMediaAvailability", peg$programMediaAvailability).append("peg$testDefaultValue", peg$testDefaultValue).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tvSeasonEpisodeNumber).append(peg$contractName).append(peg$ExclusiveFrench).append(longDescriptionLocalized).append(tvSeasonNumber).append(languages).append(peg$priorityLevelDisney).append(approved).append(updated).append(peg$priorityLevelKidsFunandAdventure).append(description).append(longDescription).append(year).append(titleLocalized).append(peg$priorityLevelRomance).append(peg$arContentRating).append(imageMediaIds).append(peg$priorityLevelComedy).append(peg$priorityLevelDisneyKids).append(editorialRating).append(peg$priorityLevelKidsAction).append(shortDescription).append(seriesEpisodeNumber).append(additionalProperties).append(descriptionLocalized).append(peg$priorityLevel).append(shortDescriptionLocalized).append(peg$priorityLevelChildrenandFamily).append(media).append(ratings).append(peg$priorityLevelDrama).append(peg$contentClassification).append(peg$priorityLevelKids).append(displayGenre).append(peg$testDefaultValue).append(peg$availableInSection).append(credits).append(peg$priorityLevelKidsPreschool).append(id).append(peg$priorityLevelKidsMagicandDreams).append(title).append(peg$productCode).append(peg$priorityLevelActionandAdventure).append(peg$programMediaAvailability).append(tagIds).append(isAdult).append(programType).append(tags).append(added).append(peg$priorityLevelArabic).append(thumbnails).append(tvSeasonId).append(guid).append(peg$countryOfOrigin).append(peg$arAgeRating).append(peg$priorityLevelThriller).append(seriesId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Entry) == false) {
            return false;
        }
        Entry rhs = ((Entry) other);
        return new EqualsBuilder().append(tvSeasonEpisodeNumber, rhs.tvSeasonEpisodeNumber).append(peg$contractName, rhs.peg$contractName).append(peg$ExclusiveFrench, rhs.peg$ExclusiveFrench).append(longDescriptionLocalized, rhs.longDescriptionLocalized).append(tvSeasonNumber, rhs.tvSeasonNumber).append(languages, rhs.languages).append(peg$priorityLevelDisney, rhs.peg$priorityLevelDisney).append(approved, rhs.approved).append(updated, rhs.updated).append(peg$priorityLevelKidsFunandAdventure, rhs.peg$priorityLevelKidsFunandAdventure).append(description, rhs.description).append(longDescription, rhs.longDescription).append(year, rhs.year).append(titleLocalized, rhs.titleLocalized).append(peg$priorityLevelRomance, rhs.peg$priorityLevelRomance).append(peg$arContentRating, rhs.peg$arContentRating).append(imageMediaIds, rhs.imageMediaIds).append(peg$priorityLevelComedy, rhs.peg$priorityLevelComedy).append(peg$priorityLevelDisneyKids, rhs.peg$priorityLevelDisneyKids).append(editorialRating, rhs.editorialRating).append(peg$priorityLevelKidsAction, rhs.peg$priorityLevelKidsAction).append(shortDescription, rhs.shortDescription).append(seriesEpisodeNumber, rhs.seriesEpisodeNumber).append(additionalProperties, rhs.additionalProperties).append(descriptionLocalized, rhs.descriptionLocalized).append(peg$priorityLevel, rhs.peg$priorityLevel).append(shortDescriptionLocalized, rhs.shortDescriptionLocalized).append(peg$priorityLevelChildrenandFamily, rhs.peg$priorityLevelChildrenandFamily).append(media, rhs.media).append(ratings, rhs.ratings).append(peg$priorityLevelDrama, rhs.peg$priorityLevelDrama).append(peg$contentClassification, rhs.peg$contentClassification).append(peg$priorityLevelKids, rhs.peg$priorityLevelKids).append(displayGenre, rhs.displayGenre).append(peg$testDefaultValue, rhs.peg$testDefaultValue).append(peg$availableInSection, rhs.peg$availableInSection).append(credits, rhs.credits).append(peg$priorityLevelKidsPreschool, rhs.peg$priorityLevelKidsPreschool).append(id, rhs.id).append(peg$priorityLevelKidsMagicandDreams, rhs.peg$priorityLevelKidsMagicandDreams).append(title, rhs.title).append(peg$productCode, rhs.peg$productCode).append(peg$priorityLevelActionandAdventure, rhs.peg$priorityLevelActionandAdventure).append(peg$programMediaAvailability, rhs.peg$programMediaAvailability).append(tagIds, rhs.tagIds).append(isAdult, rhs.isAdult).append(programType, rhs.programType).append(tags, rhs.tags).append(added, rhs.added).append(peg$priorityLevelArabic, rhs.peg$priorityLevelArabic).append(thumbnails, rhs.thumbnails).append(tvSeasonId, rhs.tvSeasonId).append(guid, rhs.guid).append(peg$countryOfOrigin, rhs.peg$countryOfOrigin).append(peg$arAgeRating, rhs.peg$arAgeRating).append(peg$priorityLevelThriller, rhs.peg$priorityLevelThriller).append(seriesId, rhs.seriesId).isEquals();
    }

}
