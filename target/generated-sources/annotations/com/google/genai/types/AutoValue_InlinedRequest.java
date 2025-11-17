package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_InlinedRequest extends InlinedRequest {

  private final Optional<String> model;

  private final Optional<List<Content>> contents;

  private final Optional<Map<String, String>> metadata;

  private final Optional<GenerateContentConfig> config;

  private AutoValue_InlinedRequest(
      Optional<String> model,
      Optional<List<Content>> contents,
      Optional<Map<String, String>> metadata,
      Optional<GenerateContentConfig> config) {
    this.model = model;
    this.contents = contents;
    this.metadata = metadata;
    this.config = config;
  }

  @JsonProperty("model")
  @Override
  public Optional<String> model() {
    return model;
  }

  @JsonProperty("contents")
  @Override
  public Optional<List<Content>> contents() {
    return contents;
  }

  @JsonProperty("metadata")
  @Override
  public Optional<Map<String, String>> metadata() {
    return metadata;
  }

  @JsonProperty("config")
  @Override
  public Optional<GenerateContentConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "InlinedRequest{"
        + "model=" + model + ", "
        + "contents=" + contents + ", "
        + "metadata=" + metadata + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InlinedRequest) {
      InlinedRequest that = (InlinedRequest) o;
      return this.model.equals(that.model())
          && this.contents.equals(that.contents())
          && this.metadata.equals(that.metadata())
          && this.config.equals(that.config());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= model.hashCode();
    h$ *= 1000003;
    h$ ^= contents.hashCode();
    h$ *= 1000003;
    h$ ^= metadata.hashCode();
    h$ *= 1000003;
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public InlinedRequest.Builder toBuilder() {
    return new AutoValue_InlinedRequest.Builder(this);
  }

  static final class Builder extends InlinedRequest.Builder {
    private Optional<String> model = Optional.empty();
    private Optional<List<Content>> contents = Optional.empty();
    private Optional<Map<String, String>> metadata = Optional.empty();
    private Optional<GenerateContentConfig> config = Optional.empty();
    Builder() {
    }
    Builder(InlinedRequest source) {
      this.model = source.model();
      this.contents = source.contents();
      this.metadata = source.metadata();
      this.config = source.config();
    }
    @Override
    public InlinedRequest.Builder model(String model) {
      this.model = Optional.of(model);
      return this;
    }
    @Override
    InlinedRequest.Builder model(Optional<String> model) {
      if (model == null) {
        throw new NullPointerException("Null model");
      }
      this.model = model;
      return this;
    }
    @Override
    public InlinedRequest.Builder contents(List<Content> contents) {
      this.contents = Optional.of(contents);
      return this;
    }
    @Override
    InlinedRequest.Builder contents(Optional<List<Content>> contents) {
      if (contents == null) {
        throw new NullPointerException("Null contents");
      }
      this.contents = contents;
      return this;
    }
    @Override
    public InlinedRequest.Builder metadata(Map<String, String> metadata) {
      this.metadata = Optional.of(metadata);
      return this;
    }
    @Override
    InlinedRequest.Builder metadata(Optional<Map<String, String>> metadata) {
      if (metadata == null) {
        throw new NullPointerException("Null metadata");
      }
      this.metadata = metadata;
      return this;
    }
    @Override
    public InlinedRequest.Builder config(GenerateContentConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    InlinedRequest.Builder config(Optional<GenerateContentConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public InlinedRequest build() {
      return new AutoValue_InlinedRequest(
          this.model,
          this.contents,
          this.metadata,
          this.config);
    }
  }

}
