package org.agorava.xing.jackson;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class PhotoUrlsMixin {

    @JsonProperty("medium_thumb")
    String mediumThumb;
    @JsonProperty("thumb")
    String thumb;
    @JsonProperty("mini_thumb")
    String miniThumb;
    @JsonProperty("maxi_thumb")
    String maxiThumb;
    @JsonProperty("large")
    String large;

}
