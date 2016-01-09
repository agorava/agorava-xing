
package org.agorava.xing.jackson;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class BirthDateMixin {

    @JsonCreator
     BirthDateMixin(@JsonProperty("day") int day,
                    @JsonProperty("year") int year,
                    @JsonProperty("month") int month) {

    }

}
