package sk.dobos.autobazar.models;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "code",
            "symbol",
            "rate",
            "description",
            "rate_float"
    })
    @Generated("jsonschema2pojo")
    public class Usd {

        @JsonProperty("code")
        private String code;
        @JsonProperty("symbol")
        private String symbol;
        @JsonProperty("rate")
        private String rate;
        @JsonProperty("description")
        private String description;
        @JsonProperty("rate_float")
        private Double rateFloat;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("code")
        public String getCode() {
            return code;
        }

        @JsonProperty("code")
        public void setCode(String code) {
            this.code = code;
        }

        @JsonProperty("symbol")
        public String getSymbol() {
            return symbol;
        }

        @JsonProperty("symbol")
        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        @JsonProperty("rate")
        public String getRate() {
            return rate;
        }

        @JsonProperty("rate")
        public void setRate(String rate) {
            this.rate = rate;
        }

        @JsonProperty("description")
        public String getDescription() {
            return description;
        }

        @JsonProperty("description")
        public void setDescription(String description) {
            this.description = description;
        }

        @JsonProperty("rate_float")
        public Double getRateFloat() {
            return rateFloat;
        }

        @JsonProperty("rate_float")
        public void setRateFloat(Double rateFloat) {
            this.rateFloat = rateFloat;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

