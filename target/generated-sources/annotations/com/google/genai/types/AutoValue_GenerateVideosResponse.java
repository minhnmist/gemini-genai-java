package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GenerateVideosResponse extends GenerateVideosResponse {

  private final Optional<List<GeneratedVideo>> generatedVideos;

  private final Optional<Integer> raiMediaFilteredCount;

  private final Optional<List<String>> raiMediaFilteredReasons;

  private AutoValue_GenerateVideosResponse(
      Optional<List<GeneratedVideo>> generatedVideos,
      Optional<Integer> raiMediaFilteredCount,
      Optional<List<String>> raiMediaFilteredReasons) {
    this.generatedVideos = generatedVideos;
    this.raiMediaFilteredCount = raiMediaFilteredCount;
    this.raiMediaFilteredReasons = raiMediaFilteredReasons;
  }

  @JsonProperty("generatedVideos")
  @Override
  public Optional<List<GeneratedVideo>> generatedVideos() {
    return generatedVideos;
  }

  @JsonProperty("raiMediaFilteredCount")
  @Override
  public Optional<Integer> raiMediaFilteredCount() {
    return raiMediaFilteredCount;
  }

  @JsonProperty("raiMediaFilteredReasons")
  @Override
  public Optional<List<String>> raiMediaFilteredReasons() {
    return raiMediaFilteredReasons;
  }

  @Override
  public String toString() {
    return "GenerateVideosResponse{"
        + "generatedVideos=" + generatedVideos + ", "
        + "raiMediaFilteredCount=" + raiMediaFilteredCount + ", "
        + "raiMediaFilteredReasons=" + raiMediaFilteredReasons
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GenerateVideosResponse) {
      GenerateVideosResponse that = (GenerateVideosResponse) o;
      return this.generatedVideos.equals(that.generatedVideos())
          && this.raiMediaFilteredCount.equals(that.raiMediaFilteredCount())
          && this.raiMediaFilteredReasons.equals(that.raiMediaFilteredReasons());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= generatedVideos.hashCode();
    h$ *= 1000003;
    h$ ^= raiMediaFilteredCount.hashCode();
    h$ *= 1000003;
    h$ ^= raiMediaFilteredReasons.hashCode();
    return h$;
  }

  @Override
  public GenerateVideosResponse.Builder toBuilder() {
    return new AutoValue_GenerateVideosResponse.Builder(this);
  }

  static final class Builder extends GenerateVideosResponse.Builder {
    private Optional<List<GeneratedVideo>> generatedVideos = Optional.empty();
    private Optional<Integer> raiMediaFilteredCount = Optional.empty();
    private Optional<List<String>> raiMediaFilteredReasons = Optional.empty();
    Builder() {
    }
    Builder(GenerateVideosResponse source) {
      this.generatedVideos = source.generatedVideos();
      this.raiMediaFilteredCount = source.raiMediaFilteredCount();
      this.raiMediaFilteredReasons = source.raiMediaFilteredReasons();
    }
    @Override
    public GenerateVideosResponse.Builder generatedVideos(List<GeneratedVideo> generatedVideos) {
      this.generatedVideos = Optional.of(generatedVideos);
      return this;
    }
    @Override
    GenerateVideosResponse.Builder generatedVideos(Optional<List<GeneratedVideo>> generatedVideos) {
      if (generatedVideos == null) {
        throw new NullPointerException("Null generatedVideos");
      }
      this.generatedVideos = generatedVideos;
      return this;
    }
    @Override
    public GenerateVideosResponse.Builder raiMediaFilteredCount(Integer raiMediaFilteredCount) {
      this.raiMediaFilteredCount = Optional.of(raiMediaFilteredCount);
      return this;
    }
    @Override
    GenerateVideosResponse.Builder raiMediaFilteredCount(Optional<Integer> raiMediaFilteredCount) {
      if (raiMediaFilteredCount == null) {
        throw new NullPointerException("Null raiMediaFilteredCount");
      }
      this.raiMediaFilteredCount = raiMediaFilteredCount;
      return this;
    }
    @Override
    public GenerateVideosResponse.Builder raiMediaFilteredReasons(List<String> raiMediaFilteredReasons) {
      this.raiMediaFilteredReasons = Optional.of(raiMediaFilteredReasons);
      return this;
    }
    @Override
    GenerateVideosResponse.Builder raiMediaFilteredReasons(Optional<List<String>> raiMediaFilteredReasons) {
      if (raiMediaFilteredReasons == null) {
        throw new NullPointerException("Null raiMediaFilteredReasons");
      }
      this.raiMediaFilteredReasons = raiMediaFilteredReasons;
      return this;
    }
    @Override
    public GenerateVideosResponse build() {
      return new AutoValue_GenerateVideosResponse(
          this.generatedVideos,
          this.raiMediaFilteredCount,
          this.raiMediaFilteredReasons);
    }
  }

}
