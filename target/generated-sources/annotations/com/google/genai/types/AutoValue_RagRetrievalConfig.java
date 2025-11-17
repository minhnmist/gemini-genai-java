package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_RagRetrievalConfig extends RagRetrievalConfig {

  private final Optional<RagRetrievalConfigFilter> filter;

  private final Optional<RagRetrievalConfigHybridSearch> hybridSearch;

  private final Optional<RagRetrievalConfigRanking> ranking;

  private final Optional<Integer> topK;

  private AutoValue_RagRetrievalConfig(
      Optional<RagRetrievalConfigFilter> filter,
      Optional<RagRetrievalConfigHybridSearch> hybridSearch,
      Optional<RagRetrievalConfigRanking> ranking,
      Optional<Integer> topK) {
    this.filter = filter;
    this.hybridSearch = hybridSearch;
    this.ranking = ranking;
    this.topK = topK;
  }

  @JsonProperty("filter")
  @Override
  public Optional<RagRetrievalConfigFilter> filter() {
    return filter;
  }

  @JsonProperty("hybridSearch")
  @Override
  public Optional<RagRetrievalConfigHybridSearch> hybridSearch() {
    return hybridSearch;
  }

  @JsonProperty("ranking")
  @Override
  public Optional<RagRetrievalConfigRanking> ranking() {
    return ranking;
  }

  @JsonProperty("topK")
  @Override
  public Optional<Integer> topK() {
    return topK;
  }

  @Override
  public String toString() {
    return "RagRetrievalConfig{"
        + "filter=" + filter + ", "
        + "hybridSearch=" + hybridSearch + ", "
        + "ranking=" + ranking + ", "
        + "topK=" + topK
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RagRetrievalConfig) {
      RagRetrievalConfig that = (RagRetrievalConfig) o;
      return this.filter.equals(that.filter())
          && this.hybridSearch.equals(that.hybridSearch())
          && this.ranking.equals(that.ranking())
          && this.topK.equals(that.topK());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= filter.hashCode();
    h$ *= 1000003;
    h$ ^= hybridSearch.hashCode();
    h$ *= 1000003;
    h$ ^= ranking.hashCode();
    h$ *= 1000003;
    h$ ^= topK.hashCode();
    return h$;
  }

  @Override
  public RagRetrievalConfig.Builder toBuilder() {
    return new AutoValue_RagRetrievalConfig.Builder(this);
  }

  static final class Builder extends RagRetrievalConfig.Builder {
    private Optional<RagRetrievalConfigFilter> filter = Optional.empty();
    private Optional<RagRetrievalConfigHybridSearch> hybridSearch = Optional.empty();
    private Optional<RagRetrievalConfigRanking> ranking = Optional.empty();
    private Optional<Integer> topK = Optional.empty();
    Builder() {
    }
    Builder(RagRetrievalConfig source) {
      this.filter = source.filter();
      this.hybridSearch = source.hybridSearch();
      this.ranking = source.ranking();
      this.topK = source.topK();
    }
    @Override
    public RagRetrievalConfig.Builder filter(RagRetrievalConfigFilter filter) {
      this.filter = Optional.of(filter);
      return this;
    }
    @Override
    RagRetrievalConfig.Builder filter(Optional<RagRetrievalConfigFilter> filter) {
      if (filter == null) {
        throw new NullPointerException("Null filter");
      }
      this.filter = filter;
      return this;
    }
    @Override
    public RagRetrievalConfig.Builder hybridSearch(RagRetrievalConfigHybridSearch hybridSearch) {
      this.hybridSearch = Optional.of(hybridSearch);
      return this;
    }
    @Override
    RagRetrievalConfig.Builder hybridSearch(Optional<RagRetrievalConfigHybridSearch> hybridSearch) {
      if (hybridSearch == null) {
        throw new NullPointerException("Null hybridSearch");
      }
      this.hybridSearch = hybridSearch;
      return this;
    }
    @Override
    public RagRetrievalConfig.Builder ranking(RagRetrievalConfigRanking ranking) {
      this.ranking = Optional.of(ranking);
      return this;
    }
    @Override
    RagRetrievalConfig.Builder ranking(Optional<RagRetrievalConfigRanking> ranking) {
      if (ranking == null) {
        throw new NullPointerException("Null ranking");
      }
      this.ranking = ranking;
      return this;
    }
    @Override
    public RagRetrievalConfig.Builder topK(Integer topK) {
      this.topK = Optional.of(topK);
      return this;
    }
    @Override
    RagRetrievalConfig.Builder topK(Optional<Integer> topK) {
      if (topK == null) {
        throw new NullPointerException("Null topK");
      }
      this.topK = topK;
      return this;
    }
    @Override
    public RagRetrievalConfig build() {
      return new AutoValue_RagRetrievalConfig(
          this.filter,
          this.hybridSearch,
          this.ranking,
          this.topK);
    }
  }

}
