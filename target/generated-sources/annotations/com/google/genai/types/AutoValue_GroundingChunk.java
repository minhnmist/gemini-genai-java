package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GroundingChunk extends GroundingChunk {

  private final Optional<GroundingChunkMaps> maps;

  private final Optional<GroundingChunkRetrievedContext> retrievedContext;

  private final Optional<GroundingChunkWeb> web;

  private AutoValue_GroundingChunk(
      Optional<GroundingChunkMaps> maps,
      Optional<GroundingChunkRetrievedContext> retrievedContext,
      Optional<GroundingChunkWeb> web) {
    this.maps = maps;
    this.retrievedContext = retrievedContext;
    this.web = web;
  }

  @JsonProperty("maps")
  @Override
  public Optional<GroundingChunkMaps> maps() {
    return maps;
  }

  @JsonProperty("retrievedContext")
  @Override
  public Optional<GroundingChunkRetrievedContext> retrievedContext() {
    return retrievedContext;
  }

  @JsonProperty("web")
  @Override
  public Optional<GroundingChunkWeb> web() {
    return web;
  }

  @Override
  public String toString() {
    return "GroundingChunk{"
        + "maps=" + maps + ", "
        + "retrievedContext=" + retrievedContext + ", "
        + "web=" + web
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GroundingChunk) {
      GroundingChunk that = (GroundingChunk) o;
      return this.maps.equals(that.maps())
          && this.retrievedContext.equals(that.retrievedContext())
          && this.web.equals(that.web());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= maps.hashCode();
    h$ *= 1000003;
    h$ ^= retrievedContext.hashCode();
    h$ *= 1000003;
    h$ ^= web.hashCode();
    return h$;
  }

  @Override
  public GroundingChunk.Builder toBuilder() {
    return new AutoValue_GroundingChunk.Builder(this);
  }

  static final class Builder extends GroundingChunk.Builder {
    private Optional<GroundingChunkMaps> maps = Optional.empty();
    private Optional<GroundingChunkRetrievedContext> retrievedContext = Optional.empty();
    private Optional<GroundingChunkWeb> web = Optional.empty();
    Builder() {
    }
    Builder(GroundingChunk source) {
      this.maps = source.maps();
      this.retrievedContext = source.retrievedContext();
      this.web = source.web();
    }
    @Override
    public GroundingChunk.Builder maps(GroundingChunkMaps maps) {
      this.maps = Optional.of(maps);
      return this;
    }
    @Override
    GroundingChunk.Builder maps(Optional<GroundingChunkMaps> maps) {
      if (maps == null) {
        throw new NullPointerException("Null maps");
      }
      this.maps = maps;
      return this;
    }
    @Override
    public GroundingChunk.Builder retrievedContext(GroundingChunkRetrievedContext retrievedContext) {
      this.retrievedContext = Optional.of(retrievedContext);
      return this;
    }
    @Override
    GroundingChunk.Builder retrievedContext(Optional<GroundingChunkRetrievedContext> retrievedContext) {
      if (retrievedContext == null) {
        throw new NullPointerException("Null retrievedContext");
      }
      this.retrievedContext = retrievedContext;
      return this;
    }
    @Override
    public GroundingChunk.Builder web(GroundingChunkWeb web) {
      this.web = Optional.of(web);
      return this;
    }
    @Override
    GroundingChunk.Builder web(Optional<GroundingChunkWeb> web) {
      if (web == null) {
        throw new NullPointerException("Null web");
      }
      this.web = web;
      return this;
    }
    @Override
    public GroundingChunk build() {
      return new AutoValue_GroundingChunk(
          this.maps,
          this.retrievedContext,
          this.web);
    }
  }

}
