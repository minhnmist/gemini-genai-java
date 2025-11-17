package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Candidate extends Candidate {

  private final Optional<Content> content;

  private final Optional<CitationMetadata> citationMetadata;

  private final Optional<String> finishMessage;

  private final Optional<Integer> tokenCount;

  private final Optional<FinishReason> finishReason;

  private final Optional<Double> avgLogprobs;

  private final Optional<GroundingMetadata> groundingMetadata;

  private final Optional<Integer> index;

  private final Optional<LogprobsResult> logprobsResult;

  private final Optional<List<SafetyRating>> safetyRatings;

  private final Optional<UrlContextMetadata> urlContextMetadata;

  private AutoValue_Candidate(
      Optional<Content> content,
      Optional<CitationMetadata> citationMetadata,
      Optional<String> finishMessage,
      Optional<Integer> tokenCount,
      Optional<FinishReason> finishReason,
      Optional<Double> avgLogprobs,
      Optional<GroundingMetadata> groundingMetadata,
      Optional<Integer> index,
      Optional<LogprobsResult> logprobsResult,
      Optional<List<SafetyRating>> safetyRatings,
      Optional<UrlContextMetadata> urlContextMetadata) {
    this.content = content;
    this.citationMetadata = citationMetadata;
    this.finishMessage = finishMessage;
    this.tokenCount = tokenCount;
    this.finishReason = finishReason;
    this.avgLogprobs = avgLogprobs;
    this.groundingMetadata = groundingMetadata;
    this.index = index;
    this.logprobsResult = logprobsResult;
    this.safetyRatings = safetyRatings;
    this.urlContextMetadata = urlContextMetadata;
  }

  @JsonProperty("content")
  @Override
  public Optional<Content> content() {
    return content;
  }

  @JsonProperty("citationMetadata")
  @Override
  public Optional<CitationMetadata> citationMetadata() {
    return citationMetadata;
  }

  @JsonProperty("finishMessage")
  @Override
  public Optional<String> finishMessage() {
    return finishMessage;
  }

  @JsonProperty("tokenCount")
  @Override
  public Optional<Integer> tokenCount() {
    return tokenCount;
  }

  @JsonProperty("finishReason")
  @Override
  public Optional<FinishReason> finishReason() {
    return finishReason;
  }

  @JsonProperty("avgLogprobs")
  @Override
  public Optional<Double> avgLogprobs() {
    return avgLogprobs;
  }

  @JsonProperty("groundingMetadata")
  @Override
  public Optional<GroundingMetadata> groundingMetadata() {
    return groundingMetadata;
  }

  @JsonProperty("index")
  @Override
  public Optional<Integer> index() {
    return index;
  }

  @JsonProperty("logprobsResult")
  @Override
  public Optional<LogprobsResult> logprobsResult() {
    return logprobsResult;
  }

  @JsonProperty("safetyRatings")
  @Override
  public Optional<List<SafetyRating>> safetyRatings() {
    return safetyRatings;
  }

  @JsonProperty("urlContextMetadata")
  @Override
  public Optional<UrlContextMetadata> urlContextMetadata() {
    return urlContextMetadata;
  }

  @Override
  public String toString() {
    return "Candidate{"
        + "content=" + content + ", "
        + "citationMetadata=" + citationMetadata + ", "
        + "finishMessage=" + finishMessage + ", "
        + "tokenCount=" + tokenCount + ", "
        + "finishReason=" + finishReason + ", "
        + "avgLogprobs=" + avgLogprobs + ", "
        + "groundingMetadata=" + groundingMetadata + ", "
        + "index=" + index + ", "
        + "logprobsResult=" + logprobsResult + ", "
        + "safetyRatings=" + safetyRatings + ", "
        + "urlContextMetadata=" + urlContextMetadata
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Candidate) {
      Candidate that = (Candidate) o;
      return this.content.equals(that.content())
          && this.citationMetadata.equals(that.citationMetadata())
          && this.finishMessage.equals(that.finishMessage())
          && this.tokenCount.equals(that.tokenCount())
          && this.finishReason.equals(that.finishReason())
          && this.avgLogprobs.equals(that.avgLogprobs())
          && this.groundingMetadata.equals(that.groundingMetadata())
          && this.index.equals(that.index())
          && this.logprobsResult.equals(that.logprobsResult())
          && this.safetyRatings.equals(that.safetyRatings())
          && this.urlContextMetadata.equals(that.urlContextMetadata());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= content.hashCode();
    h$ *= 1000003;
    h$ ^= citationMetadata.hashCode();
    h$ *= 1000003;
    h$ ^= finishMessage.hashCode();
    h$ *= 1000003;
    h$ ^= tokenCount.hashCode();
    h$ *= 1000003;
    h$ ^= finishReason.hashCode();
    h$ *= 1000003;
    h$ ^= avgLogprobs.hashCode();
    h$ *= 1000003;
    h$ ^= groundingMetadata.hashCode();
    h$ *= 1000003;
    h$ ^= index.hashCode();
    h$ *= 1000003;
    h$ ^= logprobsResult.hashCode();
    h$ *= 1000003;
    h$ ^= safetyRatings.hashCode();
    h$ *= 1000003;
    h$ ^= urlContextMetadata.hashCode();
    return h$;
  }

  @Override
  public Candidate.Builder toBuilder() {
    return new AutoValue_Candidate.Builder(this);
  }

  static final class Builder extends Candidate.Builder {
    private Optional<Content> content = Optional.empty();
    private Optional<CitationMetadata> citationMetadata = Optional.empty();
    private Optional<String> finishMessage = Optional.empty();
    private Optional<Integer> tokenCount = Optional.empty();
    private Optional<FinishReason> finishReason = Optional.empty();
    private Optional<Double> avgLogprobs = Optional.empty();
    private Optional<GroundingMetadata> groundingMetadata = Optional.empty();
    private Optional<Integer> index = Optional.empty();
    private Optional<LogprobsResult> logprobsResult = Optional.empty();
    private Optional<List<SafetyRating>> safetyRatings = Optional.empty();
    private Optional<UrlContextMetadata> urlContextMetadata = Optional.empty();
    Builder() {
    }
    Builder(Candidate source) {
      this.content = source.content();
      this.citationMetadata = source.citationMetadata();
      this.finishMessage = source.finishMessage();
      this.tokenCount = source.tokenCount();
      this.finishReason = source.finishReason();
      this.avgLogprobs = source.avgLogprobs();
      this.groundingMetadata = source.groundingMetadata();
      this.index = source.index();
      this.logprobsResult = source.logprobsResult();
      this.safetyRatings = source.safetyRatings();
      this.urlContextMetadata = source.urlContextMetadata();
    }
    @Override
    public Candidate.Builder content(Content content) {
      this.content = Optional.of(content);
      return this;
    }
    @Override
    Candidate.Builder content(Optional<Content> content) {
      if (content == null) {
        throw new NullPointerException("Null content");
      }
      this.content = content;
      return this;
    }
    @Override
    public Candidate.Builder citationMetadata(CitationMetadata citationMetadata) {
      this.citationMetadata = Optional.of(citationMetadata);
      return this;
    }
    @Override
    Candidate.Builder citationMetadata(Optional<CitationMetadata> citationMetadata) {
      if (citationMetadata == null) {
        throw new NullPointerException("Null citationMetadata");
      }
      this.citationMetadata = citationMetadata;
      return this;
    }
    @Override
    public Candidate.Builder finishMessage(String finishMessage) {
      this.finishMessage = Optional.of(finishMessage);
      return this;
    }
    @Override
    Candidate.Builder finishMessage(Optional<String> finishMessage) {
      if (finishMessage == null) {
        throw new NullPointerException("Null finishMessage");
      }
      this.finishMessage = finishMessage;
      return this;
    }
    @Override
    public Candidate.Builder tokenCount(Integer tokenCount) {
      this.tokenCount = Optional.of(tokenCount);
      return this;
    }
    @Override
    Candidate.Builder tokenCount(Optional<Integer> tokenCount) {
      if (tokenCount == null) {
        throw new NullPointerException("Null tokenCount");
      }
      this.tokenCount = tokenCount;
      return this;
    }
    @Override
    public Candidate.Builder finishReason(FinishReason finishReason) {
      this.finishReason = Optional.of(finishReason);
      return this;
    }
    @Override
    Candidate.Builder finishReason(Optional<FinishReason> finishReason) {
      if (finishReason == null) {
        throw new NullPointerException("Null finishReason");
      }
      this.finishReason = finishReason;
      return this;
    }
    @Override
    public Candidate.Builder avgLogprobs(Double avgLogprobs) {
      this.avgLogprobs = Optional.of(avgLogprobs);
      return this;
    }
    @Override
    Candidate.Builder avgLogprobs(Optional<Double> avgLogprobs) {
      if (avgLogprobs == null) {
        throw new NullPointerException("Null avgLogprobs");
      }
      this.avgLogprobs = avgLogprobs;
      return this;
    }
    @Override
    public Candidate.Builder groundingMetadata(GroundingMetadata groundingMetadata) {
      this.groundingMetadata = Optional.of(groundingMetadata);
      return this;
    }
    @Override
    Candidate.Builder groundingMetadata(Optional<GroundingMetadata> groundingMetadata) {
      if (groundingMetadata == null) {
        throw new NullPointerException("Null groundingMetadata");
      }
      this.groundingMetadata = groundingMetadata;
      return this;
    }
    @Override
    public Candidate.Builder index(Integer index) {
      this.index = Optional.of(index);
      return this;
    }
    @Override
    Candidate.Builder index(Optional<Integer> index) {
      if (index == null) {
        throw new NullPointerException("Null index");
      }
      this.index = index;
      return this;
    }
    @Override
    public Candidate.Builder logprobsResult(LogprobsResult logprobsResult) {
      this.logprobsResult = Optional.of(logprobsResult);
      return this;
    }
    @Override
    Candidate.Builder logprobsResult(Optional<LogprobsResult> logprobsResult) {
      if (logprobsResult == null) {
        throw new NullPointerException("Null logprobsResult");
      }
      this.logprobsResult = logprobsResult;
      return this;
    }
    @Override
    public Candidate.Builder safetyRatings(List<SafetyRating> safetyRatings) {
      this.safetyRatings = Optional.of(safetyRatings);
      return this;
    }
    @Override
    Candidate.Builder safetyRatings(Optional<List<SafetyRating>> safetyRatings) {
      if (safetyRatings == null) {
        throw new NullPointerException("Null safetyRatings");
      }
      this.safetyRatings = safetyRatings;
      return this;
    }
    @Override
    public Candidate.Builder urlContextMetadata(UrlContextMetadata urlContextMetadata) {
      this.urlContextMetadata = Optional.of(urlContextMetadata);
      return this;
    }
    @Override
    Candidate.Builder urlContextMetadata(Optional<UrlContextMetadata> urlContextMetadata) {
      if (urlContextMetadata == null) {
        throw new NullPointerException("Null urlContextMetadata");
      }
      this.urlContextMetadata = urlContextMetadata;
      return this;
    }
    @Override
    public Candidate build() {
      return new AutoValue_Candidate(
          this.content,
          this.citationMetadata,
          this.finishMessage,
          this.tokenCount,
          this.finishReason,
          this.avgLogprobs,
          this.groundingMetadata,
          this.index,
          this.logprobsResult,
          this.safetyRatings,
          this.urlContextMetadata);
    }
  }

}
