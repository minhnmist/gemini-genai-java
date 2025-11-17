package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_EmbedContentBatch extends EmbedContentBatch {

  private final Optional<List<Content>> contents;

  private final Optional<EmbedContentConfig> config;

  private AutoValue_EmbedContentBatch(
      Optional<List<Content>> contents,
      Optional<EmbedContentConfig> config) {
    this.contents = contents;
    this.config = config;
  }

  @JsonProperty("contents")
  @Override
  public Optional<List<Content>> contents() {
    return contents;
  }

  @JsonProperty("config")
  @Override
  public Optional<EmbedContentConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "EmbedContentBatch{"
        + "contents=" + contents + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof EmbedContentBatch) {
      EmbedContentBatch that = (EmbedContentBatch) o;
      return this.contents.equals(that.contents())
          && this.config.equals(that.config());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= contents.hashCode();
    h$ *= 1000003;
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public EmbedContentBatch.Builder toBuilder() {
    return new AutoValue_EmbedContentBatch.Builder(this);
  }

  static final class Builder extends EmbedContentBatch.Builder {
    private Optional<List<Content>> contents = Optional.empty();
    private Optional<EmbedContentConfig> config = Optional.empty();
    Builder() {
    }
    Builder(EmbedContentBatch source) {
      this.contents = source.contents();
      this.config = source.config();
    }
    @Override
    public EmbedContentBatch.Builder contents(List<Content> contents) {
      this.contents = Optional.of(contents);
      return this;
    }
    @Override
    EmbedContentBatch.Builder contents(Optional<List<Content>> contents) {
      if (contents == null) {
        throw new NullPointerException("Null contents");
      }
      this.contents = contents;
      return this;
    }
    @Override
    public EmbedContentBatch.Builder config(EmbedContentConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    EmbedContentBatch.Builder config(Optional<EmbedContentConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public EmbedContentBatch build() {
      return new AutoValue_EmbedContentBatch(
          this.contents,
          this.config);
    }
  }

}
