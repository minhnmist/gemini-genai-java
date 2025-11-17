package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_RagChunk extends RagChunk {

  private final Optional<RagChunkPageSpan> pageSpan;

  private final Optional<String> text;

  private AutoValue_RagChunk(
      Optional<RagChunkPageSpan> pageSpan,
      Optional<String> text) {
    this.pageSpan = pageSpan;
    this.text = text;
  }

  @JsonProperty("pageSpan")
  @Override
  public Optional<RagChunkPageSpan> pageSpan() {
    return pageSpan;
  }

  @JsonProperty("text")
  @Override
  public Optional<String> text() {
    return text;
  }

  @Override
  public String toString() {
    return "RagChunk{"
        + "pageSpan=" + pageSpan + ", "
        + "text=" + text
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RagChunk) {
      RagChunk that = (RagChunk) o;
      return this.pageSpan.equals(that.pageSpan())
          && this.text.equals(that.text());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= pageSpan.hashCode();
    h$ *= 1000003;
    h$ ^= text.hashCode();
    return h$;
  }

  @Override
  public RagChunk.Builder toBuilder() {
    return new AutoValue_RagChunk.Builder(this);
  }

  static final class Builder extends RagChunk.Builder {
    private Optional<RagChunkPageSpan> pageSpan = Optional.empty();
    private Optional<String> text = Optional.empty();
    Builder() {
    }
    Builder(RagChunk source) {
      this.pageSpan = source.pageSpan();
      this.text = source.text();
    }
    @Override
    public RagChunk.Builder pageSpan(RagChunkPageSpan pageSpan) {
      this.pageSpan = Optional.of(pageSpan);
      return this;
    }
    @Override
    RagChunk.Builder pageSpan(Optional<RagChunkPageSpan> pageSpan) {
      if (pageSpan == null) {
        throw new NullPointerException("Null pageSpan");
      }
      this.pageSpan = pageSpan;
      return this;
    }
    @Override
    public RagChunk.Builder text(String text) {
      this.text = Optional.of(text);
      return this;
    }
    @Override
    RagChunk.Builder text(Optional<String> text) {
      if (text == null) {
        throw new NullPointerException("Null text");
      }
      this.text = text;
      return this;
    }
    @Override
    public RagChunk build() {
      return new AutoValue_RagChunk(
          this.pageSpan,
          this.text);
    }
  }

}
