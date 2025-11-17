package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_EnterpriseWebSearch extends EnterpriseWebSearch {

  private final Optional<List<String>> excludeDomains;

  private final Optional<PhishBlockThreshold> blockingConfidence;

  private AutoValue_EnterpriseWebSearch(
      Optional<List<String>> excludeDomains,
      Optional<PhishBlockThreshold> blockingConfidence) {
    this.excludeDomains = excludeDomains;
    this.blockingConfidence = blockingConfidence;
  }

  @JsonProperty("excludeDomains")
  @Override
  public Optional<List<String>> excludeDomains() {
    return excludeDomains;
  }

  @JsonProperty("blockingConfidence")
  @Override
  public Optional<PhishBlockThreshold> blockingConfidence() {
    return blockingConfidence;
  }

  @Override
  public String toString() {
    return "EnterpriseWebSearch{"
        + "excludeDomains=" + excludeDomains + ", "
        + "blockingConfidence=" + blockingConfidence
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof EnterpriseWebSearch) {
      EnterpriseWebSearch that = (EnterpriseWebSearch) o;
      return this.excludeDomains.equals(that.excludeDomains())
          && this.blockingConfidence.equals(that.blockingConfidence());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= excludeDomains.hashCode();
    h$ *= 1000003;
    h$ ^= blockingConfidence.hashCode();
    return h$;
  }

  @Override
  public EnterpriseWebSearch.Builder toBuilder() {
    return new AutoValue_EnterpriseWebSearch.Builder(this);
  }

  static final class Builder extends EnterpriseWebSearch.Builder {
    private Optional<List<String>> excludeDomains = Optional.empty();
    private Optional<PhishBlockThreshold> blockingConfidence = Optional.empty();
    Builder() {
    }
    Builder(EnterpriseWebSearch source) {
      this.excludeDomains = source.excludeDomains();
      this.blockingConfidence = source.blockingConfidence();
    }
    @Override
    public EnterpriseWebSearch.Builder excludeDomains(List<String> excludeDomains) {
      this.excludeDomains = Optional.of(excludeDomains);
      return this;
    }
    @Override
    EnterpriseWebSearch.Builder excludeDomains(Optional<List<String>> excludeDomains) {
      if (excludeDomains == null) {
        throw new NullPointerException("Null excludeDomains");
      }
      this.excludeDomains = excludeDomains;
      return this;
    }
    @Override
    public EnterpriseWebSearch.Builder blockingConfidence(PhishBlockThreshold blockingConfidence) {
      this.blockingConfidence = Optional.of(blockingConfidence);
      return this;
    }
    @Override
    EnterpriseWebSearch.Builder blockingConfidence(Optional<PhishBlockThreshold> blockingConfidence) {
      if (blockingConfidence == null) {
        throw new NullPointerException("Null blockingConfidence");
      }
      this.blockingConfidence = blockingConfidence;
      return this;
    }
    @Override
    public EnterpriseWebSearch build() {
      return new AutoValue_EnterpriseWebSearch(
          this.excludeDomains,
          this.blockingConfidence);
    }
  }

}
