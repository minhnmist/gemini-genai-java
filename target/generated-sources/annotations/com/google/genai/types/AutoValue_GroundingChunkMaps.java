package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GroundingChunkMaps extends GroundingChunkMaps {

  private final Optional<GroundingChunkMapsPlaceAnswerSources> placeAnswerSources;

  private final Optional<String> placeId;

  private final Optional<String> text;

  private final Optional<String> title;

  private final Optional<String> uri;

  private AutoValue_GroundingChunkMaps(
      Optional<GroundingChunkMapsPlaceAnswerSources> placeAnswerSources,
      Optional<String> placeId,
      Optional<String> text,
      Optional<String> title,
      Optional<String> uri) {
    this.placeAnswerSources = placeAnswerSources;
    this.placeId = placeId;
    this.text = text;
    this.title = title;
    this.uri = uri;
  }

  @JsonProperty("placeAnswerSources")
  @Override
  public Optional<GroundingChunkMapsPlaceAnswerSources> placeAnswerSources() {
    return placeAnswerSources;
  }

  @JsonProperty("placeId")
  @Override
  public Optional<String> placeId() {
    return placeId;
  }

  @JsonProperty("text")
  @Override
  public Optional<String> text() {
    return text;
  }

  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return title;
  }

  @JsonProperty("uri")
  @Override
  public Optional<String> uri() {
    return uri;
  }

  @Override
  public String toString() {
    return "GroundingChunkMaps{"
        + "placeAnswerSources=" + placeAnswerSources + ", "
        + "placeId=" + placeId + ", "
        + "text=" + text + ", "
        + "title=" + title + ", "
        + "uri=" + uri
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GroundingChunkMaps) {
      GroundingChunkMaps that = (GroundingChunkMaps) o;
      return this.placeAnswerSources.equals(that.placeAnswerSources())
          && this.placeId.equals(that.placeId())
          && this.text.equals(that.text())
          && this.title.equals(that.title())
          && this.uri.equals(that.uri());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= placeAnswerSources.hashCode();
    h$ *= 1000003;
    h$ ^= placeId.hashCode();
    h$ *= 1000003;
    h$ ^= text.hashCode();
    h$ *= 1000003;
    h$ ^= title.hashCode();
    h$ *= 1000003;
    h$ ^= uri.hashCode();
    return h$;
  }

  @Override
  public GroundingChunkMaps.Builder toBuilder() {
    return new AutoValue_GroundingChunkMaps.Builder(this);
  }

  static final class Builder extends GroundingChunkMaps.Builder {
    private Optional<GroundingChunkMapsPlaceAnswerSources> placeAnswerSources = Optional.empty();
    private Optional<String> placeId = Optional.empty();
    private Optional<String> text = Optional.empty();
    private Optional<String> title = Optional.empty();
    private Optional<String> uri = Optional.empty();
    Builder() {
    }
    Builder(GroundingChunkMaps source) {
      this.placeAnswerSources = source.placeAnswerSources();
      this.placeId = source.placeId();
      this.text = source.text();
      this.title = source.title();
      this.uri = source.uri();
    }
    @Override
    public GroundingChunkMaps.Builder placeAnswerSources(GroundingChunkMapsPlaceAnswerSources placeAnswerSources) {
      this.placeAnswerSources = Optional.of(placeAnswerSources);
      return this;
    }
    @Override
    GroundingChunkMaps.Builder placeAnswerSources(Optional<GroundingChunkMapsPlaceAnswerSources> placeAnswerSources) {
      if (placeAnswerSources == null) {
        throw new NullPointerException("Null placeAnswerSources");
      }
      this.placeAnswerSources = placeAnswerSources;
      return this;
    }
    @Override
    public GroundingChunkMaps.Builder placeId(String placeId) {
      this.placeId = Optional.of(placeId);
      return this;
    }
    @Override
    GroundingChunkMaps.Builder placeId(Optional<String> placeId) {
      if (placeId == null) {
        throw new NullPointerException("Null placeId");
      }
      this.placeId = placeId;
      return this;
    }
    @Override
    public GroundingChunkMaps.Builder text(String text) {
      this.text = Optional.of(text);
      return this;
    }
    @Override
    GroundingChunkMaps.Builder text(Optional<String> text) {
      if (text == null) {
        throw new NullPointerException("Null text");
      }
      this.text = text;
      return this;
    }
    @Override
    public GroundingChunkMaps.Builder title(String title) {
      this.title = Optional.of(title);
      return this;
    }
    @Override
    GroundingChunkMaps.Builder title(Optional<String> title) {
      if (title == null) {
        throw new NullPointerException("Null title");
      }
      this.title = title;
      return this;
    }
    @Override
    public GroundingChunkMaps.Builder uri(String uri) {
      this.uri = Optional.of(uri);
      return this;
    }
    @Override
    GroundingChunkMaps.Builder uri(Optional<String> uri) {
      if (uri == null) {
        throw new NullPointerException("Null uri");
      }
      this.uri = uri;
      return this;
    }
    @Override
    public GroundingChunkMaps build() {
      return new AutoValue_GroundingChunkMaps(
          this.placeAnswerSources,
          this.placeId,
          this.text,
          this.title,
          this.uri);
    }
  }

}
