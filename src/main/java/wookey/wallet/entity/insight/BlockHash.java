package wookey.wallet.entity.insight;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class BlockHash implements Serializable {

    @JsonProperty("blockHash")
    private String blockHash;
}
