package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ComputeTokensResult extends ComputeTokensResult {

  private final Optional<List<TokensInfo>> tokensInfo;

  private AutoValue_ComputeTokensResult(
      Optional<List<TokensInfo>> tokensInfo) {
    this.tokensInfo = tokensInfo;
  }

  @JsonProperty("tokensInfo")
  @Override
  public Optional<List<TokensInfo>> tokensInfo() {
    return tokensInfo;
  }

  @Override
  public String toString() {
    return "ComputeTokensResult{"
        + "tokensInfo=" + tokensInfo
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ComputeTokensResult) {
      ComputeTokensResult that = (ComputeTokensResult) o;
      return this.tokensInfo.equals(that.tokensInfo());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= tokensInfo.hashCode();
    return h$;
  }

  @Override
  public ComputeTokensResult.Builder toBuilder() {
    return new AutoValue_ComputeTokensResult.Builder(this);
  }

  static final class Builder extends ComputeTokensResult.Builder {
    private Optional<List<TokensInfo>> tokensInfo = Optional.empty();
    Builder() {
    }
    Builder(ComputeTokensResult source) {
      this.tokensInfo = source.tokensInfo();
    }
    @Override
    public ComputeTokensResult.Builder tokensInfo(List<TokensInfo> tokensInfo) {
      this.tokensInfo = Optional.of(tokensInfo);
      return this;
    }
    @Override
    ComputeTokensResult.Builder tokensInfo(Optional<List<TokensInfo>> tokensInfo) {
      if (tokensInfo == null) {
        throw new NullPointerException("Null tokensInfo");
      }
      this.tokensInfo = tokensInfo;
      return this;
    }
    @Override
    public ComputeTokensResult build() {
      return new AutoValue_ComputeTokensResult(
          this.tokensInfo);
    }
  }

}
