package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_UrlContextMetadata extends UrlContextMetadata {

  private final Optional<List<UrlMetadata>> urlMetadata;

  private AutoValue_UrlContextMetadata(
      Optional<List<UrlMetadata>> urlMetadata) {
    this.urlMetadata = urlMetadata;
  }

  @JsonProperty("urlMetadata")
  @Override
  public Optional<List<UrlMetadata>> urlMetadata() {
    return urlMetadata;
  }

  @Override
  public String toString() {
    return "UrlContextMetadata{"
        + "urlMetadata=" + urlMetadata
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UrlContextMetadata) {
      UrlContextMetadata that = (UrlContextMetadata) o;
      return this.urlMetadata.equals(that.urlMetadata());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= urlMetadata.hashCode();
    return h$;
  }

  @Override
  public UrlContextMetadata.Builder toBuilder() {
    return new AutoValue_UrlContextMetadata.Builder(this);
  }

  static final class Builder extends UrlContextMetadata.Builder {
    private Optional<List<UrlMetadata>> urlMetadata = Optional.empty();
    Builder() {
    }
    Builder(UrlContextMetadata source) {
      this.urlMetadata = source.urlMetadata();
    }
    @Override
    public UrlContextMetadata.Builder urlMetadata(List<UrlMetadata> urlMetadata) {
      this.urlMetadata = Optional.of(urlMetadata);
      return this;
    }
    @Override
    UrlContextMetadata.Builder urlMetadata(Optional<List<UrlMetadata>> urlMetadata) {
      if (urlMetadata == null) {
        throw new NullPointerException("Null urlMetadata");
      }
      this.urlMetadata = urlMetadata;
      return this;
    }
    @Override
    public UrlContextMetadata build() {
      return new AutoValue_UrlContextMetadata(
          this.urlMetadata);
    }
  }

}
