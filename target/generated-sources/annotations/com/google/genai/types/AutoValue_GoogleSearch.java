package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GoogleSearch extends GoogleSearch {

  private final Optional<List<String>> excludeDomains;

  private final Optional<PhishBlockThreshold> blockingConfidence;

  private final Optional<Interval> timeRangeFilter;

  private AutoValue_GoogleSearch(
      Optional<List<String>> excludeDomains,
      Optional<PhishBlockThreshold> blockingConfidence,
      Optional<Interval> timeRangeFilter) {
    this.excludeDomains = excludeDomains;
    this.blockingConfidence = blockingConfidence;
    this.timeRangeFilter = timeRangeFilter;
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

  @JsonProperty("timeRangeFilter")
  @Override
  public Optional<Interval> timeRangeFilter() {
    return timeRangeFilter;
  }

  @Override
  public String toString() {
    return "GoogleSearch{"
        + "excludeDomains=" + excludeDomains + ", "
        + "blockingConfidence=" + blockingConfidence + ", "
        + "timeRangeFilter=" + timeRangeFilter
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GoogleSearch) {
      GoogleSearch that = (GoogleSearch) o;
      return this.excludeDomains.equals(that.excludeDomains())
          && this.blockingConfidence.equals(that.blockingConfidence())
          && this.timeRangeFilter.equals(that.timeRangeFilter());
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
    h$ *= 1000003;
    h$ ^= timeRangeFilter.hashCode();
    return h$;
  }

  @Override
  public GoogleSearch.Builder toBuilder() {
    return new AutoValue_GoogleSearch.Builder(this);
  }

  static final class Builder extends GoogleSearch.Builder {
    private Optional<List<String>> excludeDomains = Optional.empty();
    private Optional<PhishBlockThreshold> blockingConfidence = Optional.empty();
    private Optional<Interval> timeRangeFilter = Optional.empty();
    Builder() {
    }
    Builder(GoogleSearch source) {
      this.excludeDomains = source.excludeDomains();
      this.blockingConfidence = source.blockingConfidence();
      this.timeRangeFilter = source.timeRangeFilter();
    }
    @Override
    public GoogleSearch.Builder excludeDomains(List<String> excludeDomains) {
      this.excludeDomains = Optional.of(excludeDomains);
      return this;
    }
    @Override
    GoogleSearch.Builder excludeDomains(Optional<List<String>> excludeDomains) {
      if (excludeDomains == null) {
        throw new NullPointerException("Null excludeDomains");
      }
      this.excludeDomains = excludeDomains;
      return this;
    }
    @Override
    public GoogleSearch.Builder blockingConfidence(PhishBlockThreshold blockingConfidence) {
      this.blockingConfidence = Optional.of(blockingConfidence);
      return this;
    }
    @Override
    GoogleSearch.Builder blockingConfidence(Optional<PhishBlockThreshold> blockingConfidence) {
      if (blockingConfidence == null) {
        throw new NullPointerException("Null blockingConfidence");
      }
      this.blockingConfidence = blockingConfidence;
      return this;
    }
    @Override
    public GoogleSearch.Builder timeRangeFilter(Interval timeRangeFilter) {
      this.timeRangeFilter = Optional.of(timeRangeFilter);
      return this;
    }
    @Override
    GoogleSearch.Builder timeRangeFilter(Optional<Interval> timeRangeFilter) {
      if (timeRangeFilter == null) {
        throw new NullPointerException("Null timeRangeFilter");
      }
      this.timeRangeFilter = timeRangeFilter;
      return this;
    }
    @Override
    public GoogleSearch build() {
      return new AutoValue_GoogleSearch(
          this.excludeDomains,
          this.blockingConfidence,
          this.timeRangeFilter);
    }
  }

}
