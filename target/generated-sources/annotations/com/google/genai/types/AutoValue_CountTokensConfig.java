package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CountTokensConfig extends CountTokensConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<Content> systemInstruction;

  private final Optional<List<Tool>> tools;

  private final Optional<GenerationConfig> generationConfig;

  private AutoValue_CountTokensConfig(
      Optional<HttpOptions> httpOptions,
      Optional<Content> systemInstruction,
      Optional<List<Tool>> tools,
      Optional<GenerationConfig> generationConfig) {
    this.httpOptions = httpOptions;
    this.systemInstruction = systemInstruction;
    this.tools = tools;
    this.generationConfig = generationConfig;
  }

  @JsonProperty("httpOptions")
  @Override
  public Optional<HttpOptions> httpOptions() {
    return httpOptions;
  }

  @JsonProperty("systemInstruction")
  @Override
  public Optional<Content> systemInstruction() {
    return systemInstruction;
  }

  @JsonProperty("tools")
  @Override
  public Optional<List<Tool>> tools() {
    return tools;
  }

  @JsonProperty("generationConfig")
  @Override
  public Optional<GenerationConfig> generationConfig() {
    return generationConfig;
  }

  @Override
  public String toString() {
    return "CountTokensConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "systemInstruction=" + systemInstruction + ", "
        + "tools=" + tools + ", "
        + "generationConfig=" + generationConfig
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CountTokensConfig) {
      CountTokensConfig that = (CountTokensConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.systemInstruction.equals(that.systemInstruction())
          && this.tools.equals(that.tools())
          && this.generationConfig.equals(that.generationConfig());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= httpOptions.hashCode();
    h$ *= 1000003;
    h$ ^= systemInstruction.hashCode();
    h$ *= 1000003;
    h$ ^= tools.hashCode();
    h$ *= 1000003;
    h$ ^= generationConfig.hashCode();
    return h$;
  }

  @Override
  public CountTokensConfig.Builder toBuilder() {
    return new AutoValue_CountTokensConfig.Builder(this);
  }

  static final class Builder extends CountTokensConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<Content> systemInstruction = Optional.empty();
    private Optional<List<Tool>> tools = Optional.empty();
    private Optional<GenerationConfig> generationConfig = Optional.empty();
    Builder() {
    }
    Builder(CountTokensConfig source) {
      this.httpOptions = source.httpOptions();
      this.systemInstruction = source.systemInstruction();
      this.tools = source.tools();
      this.generationConfig = source.generationConfig();
    }
    @Override
    public CountTokensConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    CountTokensConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public CountTokensConfig.Builder systemInstruction(Content systemInstruction) {
      this.systemInstruction = Optional.of(systemInstruction);
      return this;
    }
    @Override
    CountTokensConfig.Builder systemInstruction(Optional<Content> systemInstruction) {
      if (systemInstruction == null) {
        throw new NullPointerException("Null systemInstruction");
      }
      this.systemInstruction = systemInstruction;
      return this;
    }
    @Override
    public CountTokensConfig.Builder tools(List<Tool> tools) {
      this.tools = Optional.of(tools);
      return this;
    }
    @Override
    CountTokensConfig.Builder tools(Optional<List<Tool>> tools) {
      if (tools == null) {
        throw new NullPointerException("Null tools");
      }
      this.tools = tools;
      return this;
    }
    @Override
    public CountTokensConfig.Builder generationConfig(GenerationConfig generationConfig) {
      this.generationConfig = Optional.of(generationConfig);
      return this;
    }
    @Override
    CountTokensConfig.Builder generationConfig(Optional<GenerationConfig> generationConfig) {
      if (generationConfig == null) {
        throw new NullPointerException("Null generationConfig");
      }
      this.generationConfig = generationConfig;
      return this;
    }
    @Override
    public CountTokensConfig build() {
      return new AutoValue_CountTokensConfig(
          this.httpOptions,
          this.systemInstruction,
          this.tools,
          this.generationConfig);
    }
  }

}
