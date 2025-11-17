package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_EmbeddingsBatchJobSource extends EmbeddingsBatchJobSource {

  private final Optional<String> fileName;

  private final Optional<EmbedContentBatch> inlinedRequests;

  private AutoValue_EmbeddingsBatchJobSource(
      Optional<String> fileName,
      Optional<EmbedContentBatch> inlinedRequests) {
    this.fileName = fileName;
    this.inlinedRequests = inlinedRequests;
  }

  @JsonProperty("fileName")
  @Override
  public Optional<String> fileName() {
    return fileName;
  }

  @JsonProperty("inlinedRequests")
  @Override
  public Optional<EmbedContentBatch> inlinedRequests() {
    return inlinedRequests;
  }

  @Override
  public String toString() {
    return "EmbeddingsBatchJobSource{"
        + "fileName=" + fileName + ", "
        + "inlinedRequests=" + inlinedRequests
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof EmbeddingsBatchJobSource) {
      EmbeddingsBatchJobSource that = (EmbeddingsBatchJobSource) o;
      return this.fileName.equals(that.fileName())
          && this.inlinedRequests.equals(that.inlinedRequests());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= fileName.hashCode();
    h$ *= 1000003;
    h$ ^= inlinedRequests.hashCode();
    return h$;
  }

  @Override
  public EmbeddingsBatchJobSource.Builder toBuilder() {
    return new AutoValue_EmbeddingsBatchJobSource.Builder(this);
  }

  static final class Builder extends EmbeddingsBatchJobSource.Builder {
    private Optional<String> fileName = Optional.empty();
    private Optional<EmbedContentBatch> inlinedRequests = Optional.empty();
    Builder() {
    }
    Builder(EmbeddingsBatchJobSource source) {
      this.fileName = source.fileName();
      this.inlinedRequests = source.inlinedRequests();
    }
    @Override
    public EmbeddingsBatchJobSource.Builder fileName(String fileName) {
      this.fileName = Optional.of(fileName);
      return this;
    }
    @Override
    EmbeddingsBatchJobSource.Builder fileName(Optional<String> fileName) {
      if (fileName == null) {
        throw new NullPointerException("Null fileName");
      }
      this.fileName = fileName;
      return this;
    }
    @Override
    public EmbeddingsBatchJobSource.Builder inlinedRequests(EmbedContentBatch inlinedRequests) {
      this.inlinedRequests = Optional.of(inlinedRequests);
      return this;
    }
    @Override
    EmbeddingsBatchJobSource.Builder inlinedRequests(Optional<EmbedContentBatch> inlinedRequests) {
      if (inlinedRequests == null) {
        throw new NullPointerException("Null inlinedRequests");
      }
      this.inlinedRequests = inlinedRequests;
      return this;
    }
    @Override
    public EmbeddingsBatchJobSource build() {
      return new AutoValue_EmbeddingsBatchJobSource(
          this.fileName,
          this.inlinedRequests);
    }
  }

}
