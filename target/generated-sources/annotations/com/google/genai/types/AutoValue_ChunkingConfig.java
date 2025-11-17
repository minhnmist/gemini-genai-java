package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ChunkingConfig extends ChunkingConfig {

  private final Optional<WhiteSpaceConfig> whiteSpaceConfig;

  private AutoValue_ChunkingConfig(
      Optional<WhiteSpaceConfig> whiteSpaceConfig) {
    this.whiteSpaceConfig = whiteSpaceConfig;
  }

  @JsonProperty("whiteSpaceConfig")
  @Override
  public Optional<WhiteSpaceConfig> whiteSpaceConfig() {
    return whiteSpaceConfig;
  }

  @Override
  public String toString() {
    return "ChunkingConfig{"
        + "whiteSpaceConfig=" + whiteSpaceConfig
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ChunkingConfig) {
      ChunkingConfig that = (ChunkingConfig) o;
      return this.whiteSpaceConfig.equals(that.whiteSpaceConfig());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= whiteSpaceConfig.hashCode();
    return h$;
  }

  @Override
  public ChunkingConfig.Builder toBuilder() {
    return new AutoValue_ChunkingConfig.Builder(this);
  }

  static final class Builder extends ChunkingConfig.Builder {
    private Optional<WhiteSpaceConfig> whiteSpaceConfig = Optional.empty();
    Builder() {
    }
    Builder(ChunkingConfig source) {
      this.whiteSpaceConfig = source.whiteSpaceConfig();
    }
    @Override
    public ChunkingConfig.Builder whiteSpaceConfig(WhiteSpaceConfig whiteSpaceConfig) {
      this.whiteSpaceConfig = Optional.of(whiteSpaceConfig);
      return this;
    }
    @Override
    ChunkingConfig.Builder whiteSpaceConfig(Optional<WhiteSpaceConfig> whiteSpaceConfig) {
      if (whiteSpaceConfig == null) {
        throw new NullPointerException("Null whiteSpaceConfig");
      }
      this.whiteSpaceConfig = whiteSpaceConfig;
      return this;
    }
    @Override
    public ChunkingConfig build() {
      return new AutoValue_ChunkingConfig(
          this.whiteSpaceConfig);
    }
  }

}
