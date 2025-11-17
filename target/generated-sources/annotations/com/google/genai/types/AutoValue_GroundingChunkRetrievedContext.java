package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GroundingChunkRetrievedContext extends GroundingChunkRetrievedContext {

  private final Optional<String> documentName;

  private final Optional<RagChunk> ragChunk;

  private final Optional<String> text;

  private final Optional<String> title;

  private final Optional<String> uri;

  private AutoValue_GroundingChunkRetrievedContext(
      Optional<String> documentName,
      Optional<RagChunk> ragChunk,
      Optional<String> text,
      Optional<String> title,
      Optional<String> uri) {
    this.documentName = documentName;
    this.ragChunk = ragChunk;
    this.text = text;
    this.title = title;
    this.uri = uri;
  }

  @JsonProperty("documentName")
  @Override
  public Optional<String> documentName() {
    return documentName;
  }

  @JsonProperty("ragChunk")
  @Override
  public Optional<RagChunk> ragChunk() {
    return ragChunk;
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
    return "GroundingChunkRetrievedContext{"
        + "documentName=" + documentName + ", "
        + "ragChunk=" + ragChunk + ", "
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
    if (o instanceof GroundingChunkRetrievedContext) {
      GroundingChunkRetrievedContext that = (GroundingChunkRetrievedContext) o;
      return this.documentName.equals(that.documentName())
          && this.ragChunk.equals(that.ragChunk())
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
    h$ ^= documentName.hashCode();
    h$ *= 1000003;
    h$ ^= ragChunk.hashCode();
    h$ *= 1000003;
    h$ ^= text.hashCode();
    h$ *= 1000003;
    h$ ^= title.hashCode();
    h$ *= 1000003;
    h$ ^= uri.hashCode();
    return h$;
  }

  @Override
  public GroundingChunkRetrievedContext.Builder toBuilder() {
    return new AutoValue_GroundingChunkRetrievedContext.Builder(this);
  }

  static final class Builder extends GroundingChunkRetrievedContext.Builder {
    private Optional<String> documentName = Optional.empty();
    private Optional<RagChunk> ragChunk = Optional.empty();
    private Optional<String> text = Optional.empty();
    private Optional<String> title = Optional.empty();
    private Optional<String> uri = Optional.empty();
    Builder() {
    }
    Builder(GroundingChunkRetrievedContext source) {
      this.documentName = source.documentName();
      this.ragChunk = source.ragChunk();
      this.text = source.text();
      this.title = source.title();
      this.uri = source.uri();
    }
    @Override
    public GroundingChunkRetrievedContext.Builder documentName(String documentName) {
      this.documentName = Optional.of(documentName);
      return this;
    }
    @Override
    GroundingChunkRetrievedContext.Builder documentName(Optional<String> documentName) {
      if (documentName == null) {
        throw new NullPointerException("Null documentName");
      }
      this.documentName = documentName;
      return this;
    }
    @Override
    public GroundingChunkRetrievedContext.Builder ragChunk(RagChunk ragChunk) {
      this.ragChunk = Optional.of(ragChunk);
      return this;
    }
    @Override
    GroundingChunkRetrievedContext.Builder ragChunk(Optional<RagChunk> ragChunk) {
      if (ragChunk == null) {
        throw new NullPointerException("Null ragChunk");
      }
      this.ragChunk = ragChunk;
      return this;
    }
    @Override
    public GroundingChunkRetrievedContext.Builder text(String text) {
      this.text = Optional.of(text);
      return this;
    }
    @Override
    GroundingChunkRetrievedContext.Builder text(Optional<String> text) {
      if (text == null) {
        throw new NullPointerException("Null text");
      }
      this.text = text;
      return this;
    }
    @Override
    public GroundingChunkRetrievedContext.Builder title(String title) {
      this.title = Optional.of(title);
      return this;
    }
    @Override
    GroundingChunkRetrievedContext.Builder title(Optional<String> title) {
      if (title == null) {
        throw new NullPointerException("Null title");
      }
      this.title = title;
      return this;
    }
    @Override
    public GroundingChunkRetrievedContext.Builder uri(String uri) {
      this.uri = Optional.of(uri);
      return this;
    }
    @Override
    GroundingChunkRetrievedContext.Builder uri(Optional<String> uri) {
      if (uri == null) {
        throw new NullPointerException("Null uri");
      }
      this.uri = uri;
      return this;
    }
    @Override
    public GroundingChunkRetrievedContext build() {
      return new AutoValue_GroundingChunkRetrievedContext(
          this.documentName,
          this.ragChunk,
          this.text,
          this.title,
          this.uri);
    }
  }

}
