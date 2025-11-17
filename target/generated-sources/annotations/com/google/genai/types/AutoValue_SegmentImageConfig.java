package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SegmentImageConfig extends SegmentImageConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<SegmentMode> mode;

  private final Optional<Integer> maxPredictions;

  private final Optional<Float> confidenceThreshold;

  private final Optional<Float> maskDilation;

  private final Optional<Float> binaryColorThreshold;

  private final Optional<Map<String, String>> labels;

  private AutoValue_SegmentImageConfig(
      Optional<HttpOptions> httpOptions,
      Optional<SegmentMode> mode,
      Optional<Integer> maxPredictions,
      Optional<Float> confidenceThreshold,
      Optional<Float> maskDilation,
      Optional<Float> binaryColorThreshold,
      Optional<Map<String, String>> labels) {
    this.httpOptions = httpOptions;
    this.mode = mode;
    this.maxPredictions = maxPredictions;
    this.confidenceThreshold = confidenceThreshold;
    this.maskDilation = maskDilation;
    this.binaryColorThreshold = binaryColorThreshold;
    this.labels = labels;
  }

  @JsonProperty("httpOptions")
  @Override
  public Optional<HttpOptions> httpOptions() {
    return httpOptions;
  }

  @JsonProperty("mode")
  @Override
  public Optional<SegmentMode> mode() {
    return mode;
  }

  @JsonProperty("maxPredictions")
  @Override
  public Optional<Integer> maxPredictions() {
    return maxPredictions;
  }

  @JsonProperty("confidenceThreshold")
  @Override
  public Optional<Float> confidenceThreshold() {
    return confidenceThreshold;
  }

  @JsonProperty("maskDilation")
  @Override
  public Optional<Float> maskDilation() {
    return maskDilation;
  }

  @JsonProperty("binaryColorThreshold")
  @Override
  public Optional<Float> binaryColorThreshold() {
    return binaryColorThreshold;
  }

  @JsonProperty("labels")
  @Override
  public Optional<Map<String, String>> labels() {
    return labels;
  }

  @Override
  public String toString() {
    return "SegmentImageConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "mode=" + mode + ", "
        + "maxPredictions=" + maxPredictions + ", "
        + "confidenceThreshold=" + confidenceThreshold + ", "
        + "maskDilation=" + maskDilation + ", "
        + "binaryColorThreshold=" + binaryColorThreshold + ", "
        + "labels=" + labels
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SegmentImageConfig) {
      SegmentImageConfig that = (SegmentImageConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.mode.equals(that.mode())
          && this.maxPredictions.equals(that.maxPredictions())
          && this.confidenceThreshold.equals(that.confidenceThreshold())
          && this.maskDilation.equals(that.maskDilation())
          && this.binaryColorThreshold.equals(that.binaryColorThreshold())
          && this.labels.equals(that.labels());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= httpOptions.hashCode();
    h$ *= 1000003;
    h$ ^= mode.hashCode();
    h$ *= 1000003;
    h$ ^= maxPredictions.hashCode();
    h$ *= 1000003;
    h$ ^= confidenceThreshold.hashCode();
    h$ *= 1000003;
    h$ ^= maskDilation.hashCode();
    h$ *= 1000003;
    h$ ^= binaryColorThreshold.hashCode();
    h$ *= 1000003;
    h$ ^= labels.hashCode();
    return h$;
  }

  @Override
  public SegmentImageConfig.Builder toBuilder() {
    return new AutoValue_SegmentImageConfig.Builder(this);
  }

  static final class Builder extends SegmentImageConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<SegmentMode> mode = Optional.empty();
    private Optional<Integer> maxPredictions = Optional.empty();
    private Optional<Float> confidenceThreshold = Optional.empty();
    private Optional<Float> maskDilation = Optional.empty();
    private Optional<Float> binaryColorThreshold = Optional.empty();
    private Optional<Map<String, String>> labels = Optional.empty();
    Builder() {
    }
    Builder(SegmentImageConfig source) {
      this.httpOptions = source.httpOptions();
      this.mode = source.mode();
      this.maxPredictions = source.maxPredictions();
      this.confidenceThreshold = source.confidenceThreshold();
      this.maskDilation = source.maskDilation();
      this.binaryColorThreshold = source.binaryColorThreshold();
      this.labels = source.labels();
    }
    @Override
    public SegmentImageConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    SegmentImageConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public SegmentImageConfig.Builder mode(SegmentMode mode) {
      this.mode = Optional.of(mode);
      return this;
    }
    @Override
    SegmentImageConfig.Builder mode(Optional<SegmentMode> mode) {
      if (mode == null) {
        throw new NullPointerException("Null mode");
      }
      this.mode = mode;
      return this;
    }
    @Override
    public SegmentImageConfig.Builder maxPredictions(Integer maxPredictions) {
      this.maxPredictions = Optional.of(maxPredictions);
      return this;
    }
    @Override
    SegmentImageConfig.Builder maxPredictions(Optional<Integer> maxPredictions) {
      if (maxPredictions == null) {
        throw new NullPointerException("Null maxPredictions");
      }
      this.maxPredictions = maxPredictions;
      return this;
    }
    @Override
    public SegmentImageConfig.Builder confidenceThreshold(Float confidenceThreshold) {
      this.confidenceThreshold = Optional.of(confidenceThreshold);
      return this;
    }
    @Override
    SegmentImageConfig.Builder confidenceThreshold(Optional<Float> confidenceThreshold) {
      if (confidenceThreshold == null) {
        throw new NullPointerException("Null confidenceThreshold");
      }
      this.confidenceThreshold = confidenceThreshold;
      return this;
    }
    @Override
    public SegmentImageConfig.Builder maskDilation(Float maskDilation) {
      this.maskDilation = Optional.of(maskDilation);
      return this;
    }
    @Override
    SegmentImageConfig.Builder maskDilation(Optional<Float> maskDilation) {
      if (maskDilation == null) {
        throw new NullPointerException("Null maskDilation");
      }
      this.maskDilation = maskDilation;
      return this;
    }
    @Override
    public SegmentImageConfig.Builder binaryColorThreshold(Float binaryColorThreshold) {
      this.binaryColorThreshold = Optional.of(binaryColorThreshold);
      return this;
    }
    @Override
    SegmentImageConfig.Builder binaryColorThreshold(Optional<Float> binaryColorThreshold) {
      if (binaryColorThreshold == null) {
        throw new NullPointerException("Null binaryColorThreshold");
      }
      this.binaryColorThreshold = binaryColorThreshold;
      return this;
    }
    @Override
    public SegmentImageConfig.Builder labels(Map<String, String> labels) {
      this.labels = Optional.of(labels);
      return this;
    }
    @Override
    SegmentImageConfig.Builder labels(Optional<Map<String, String>> labels) {
      if (labels == null) {
        throw new NullPointerException("Null labels");
      }
      this.labels = labels;
      return this;
    }
    @Override
    public SegmentImageConfig build() {
      return new AutoValue_SegmentImageConfig(
          this.httpOptions,
          this.mode,
          this.maxPredictions,
          this.confidenceThreshold,
          this.maskDilation,
          this.binaryColorThreshold,
          this.labels);
    }
  }

}
