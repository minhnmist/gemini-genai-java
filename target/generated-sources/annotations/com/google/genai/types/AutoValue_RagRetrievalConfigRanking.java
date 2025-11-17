package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_RagRetrievalConfigRanking extends RagRetrievalConfigRanking {

  private final Optional<RagRetrievalConfigRankingLlmRanker> llmRanker;

  private final Optional<RagRetrievalConfigRankingRankService> rankService;

  private AutoValue_RagRetrievalConfigRanking(
      Optional<RagRetrievalConfigRankingLlmRanker> llmRanker,
      Optional<RagRetrievalConfigRankingRankService> rankService) {
    this.llmRanker = llmRanker;
    this.rankService = rankService;
  }

  @JsonProperty("llmRanker")
  @Override
  public Optional<RagRetrievalConfigRankingLlmRanker> llmRanker() {
    return llmRanker;
  }

  @JsonProperty("rankService")
  @Override
  public Optional<RagRetrievalConfigRankingRankService> rankService() {
    return rankService;
  }

  @Override
  public String toString() {
    return "RagRetrievalConfigRanking{"
        + "llmRanker=" + llmRanker + ", "
        + "rankService=" + rankService
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RagRetrievalConfigRanking) {
      RagRetrievalConfigRanking that = (RagRetrievalConfigRanking) o;
      return this.llmRanker.equals(that.llmRanker())
          && this.rankService.equals(that.rankService());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= llmRanker.hashCode();
    h$ *= 1000003;
    h$ ^= rankService.hashCode();
    return h$;
  }

  @Override
  public RagRetrievalConfigRanking.Builder toBuilder() {
    return new AutoValue_RagRetrievalConfigRanking.Builder(this);
  }

  static final class Builder extends RagRetrievalConfigRanking.Builder {
    private Optional<RagRetrievalConfigRankingLlmRanker> llmRanker = Optional.empty();
    private Optional<RagRetrievalConfigRankingRankService> rankService = Optional.empty();
    Builder() {
    }
    Builder(RagRetrievalConfigRanking source) {
      this.llmRanker = source.llmRanker();
      this.rankService = source.rankService();
    }
    @Override
    public RagRetrievalConfigRanking.Builder llmRanker(RagRetrievalConfigRankingLlmRanker llmRanker) {
      this.llmRanker = Optional.of(llmRanker);
      return this;
    }
    @Override
    RagRetrievalConfigRanking.Builder llmRanker(Optional<RagRetrievalConfigRankingLlmRanker> llmRanker) {
      if (llmRanker == null) {
        throw new NullPointerException("Null llmRanker");
      }
      this.llmRanker = llmRanker;
      return this;
    }
    @Override
    public RagRetrievalConfigRanking.Builder rankService(RagRetrievalConfigRankingRankService rankService) {
      this.rankService = Optional.of(rankService);
      return this;
    }
    @Override
    RagRetrievalConfigRanking.Builder rankService(Optional<RagRetrievalConfigRankingRankService> rankService) {
      if (rankService == null) {
        throw new NullPointerException("Null rankService");
      }
      this.rankService = rankService;
      return this;
    }
    @Override
    public RagRetrievalConfigRanking build() {
      return new AutoValue_RagRetrievalConfigRanking(
          this.llmRanker,
          this.rankService);
    }
  }

}
