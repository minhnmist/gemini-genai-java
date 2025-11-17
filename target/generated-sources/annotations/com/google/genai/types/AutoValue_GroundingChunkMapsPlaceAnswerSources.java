package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GroundingChunkMapsPlaceAnswerSources extends GroundingChunkMapsPlaceAnswerSources {

  private final Optional<String> flagContentUri;

  private final Optional<List<GroundingChunkMapsPlaceAnswerSourcesReviewSnippet>> reviewSnippets;

  private AutoValue_GroundingChunkMapsPlaceAnswerSources(
      Optional<String> flagContentUri,
      Optional<List<GroundingChunkMapsPlaceAnswerSourcesReviewSnippet>> reviewSnippets) {
    this.flagContentUri = flagContentUri;
    this.reviewSnippets = reviewSnippets;
  }

  @JsonProperty("flagContentUri")
  @Override
  public Optional<String> flagContentUri() {
    return flagContentUri;
  }

  @JsonProperty("reviewSnippets")
  @Override
  public Optional<List<GroundingChunkMapsPlaceAnswerSourcesReviewSnippet>> reviewSnippets() {
    return reviewSnippets;
  }

  @Override
  public String toString() {
    return "GroundingChunkMapsPlaceAnswerSources{"
        + "flagContentUri=" + flagContentUri + ", "
        + "reviewSnippets=" + reviewSnippets
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GroundingChunkMapsPlaceAnswerSources) {
      GroundingChunkMapsPlaceAnswerSources that = (GroundingChunkMapsPlaceAnswerSources) o;
      return this.flagContentUri.equals(that.flagContentUri())
          && this.reviewSnippets.equals(that.reviewSnippets());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= flagContentUri.hashCode();
    h$ *= 1000003;
    h$ ^= reviewSnippets.hashCode();
    return h$;
  }

  @Override
  public GroundingChunkMapsPlaceAnswerSources.Builder toBuilder() {
    return new AutoValue_GroundingChunkMapsPlaceAnswerSources.Builder(this);
  }

  static final class Builder extends GroundingChunkMapsPlaceAnswerSources.Builder {
    private Optional<String> flagContentUri = Optional.empty();
    private Optional<List<GroundingChunkMapsPlaceAnswerSourcesReviewSnippet>> reviewSnippets = Optional.empty();
    Builder() {
    }
    Builder(GroundingChunkMapsPlaceAnswerSources source) {
      this.flagContentUri = source.flagContentUri();
      this.reviewSnippets = source.reviewSnippets();
    }
    @Override
    public GroundingChunkMapsPlaceAnswerSources.Builder flagContentUri(String flagContentUri) {
      this.flagContentUri = Optional.of(flagContentUri);
      return this;
    }
    @Override
    GroundingChunkMapsPlaceAnswerSources.Builder flagContentUri(Optional<String> flagContentUri) {
      if (flagContentUri == null) {
        throw new NullPointerException("Null flagContentUri");
      }
      this.flagContentUri = flagContentUri;
      return this;
    }
    @Override
    public GroundingChunkMapsPlaceAnswerSources.Builder reviewSnippets(List<GroundingChunkMapsPlaceAnswerSourcesReviewSnippet> reviewSnippets) {
      this.reviewSnippets = Optional.of(reviewSnippets);
      return this;
    }
    @Override
    GroundingChunkMapsPlaceAnswerSources.Builder reviewSnippets(Optional<List<GroundingChunkMapsPlaceAnswerSourcesReviewSnippet>> reviewSnippets) {
      if (reviewSnippets == null) {
        throw new NullPointerException("Null reviewSnippets");
      }
      this.reviewSnippets = reviewSnippets;
      return this;
    }
    @Override
    public GroundingChunkMapsPlaceAnswerSources build() {
      return new AutoValue_GroundingChunkMapsPlaceAnswerSources(
          this.flagContentUri,
          this.reviewSnippets);
    }
  }

}
