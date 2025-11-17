package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GenerateVideosConfig extends GenerateVideosConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<Integer> numberOfVideos;

  private final Optional<String> outputGcsUri;

  private final Optional<Integer> fps;

  private final Optional<Integer> durationSeconds;

  private final Optional<Integer> seed;

  private final Optional<String> aspectRatio;

  private final Optional<String> resolution;

  private final Optional<String> personGeneration;

  private final Optional<String> pubsubTopic;

  private final Optional<String> negativePrompt;

  private final Optional<Boolean> enhancePrompt;

  private final Optional<Boolean> generateAudio;

  private final Optional<Image> lastFrame;

  private final Optional<List<VideoGenerationReferenceImage>> referenceImages;

  private final Optional<VideoGenerationMask> mask;

  private final Optional<VideoCompressionQuality> compressionQuality;

  private AutoValue_GenerateVideosConfig(
      Optional<HttpOptions> httpOptions,
      Optional<Integer> numberOfVideos,
      Optional<String> outputGcsUri,
      Optional<Integer> fps,
      Optional<Integer> durationSeconds,
      Optional<Integer> seed,
      Optional<String> aspectRatio,
      Optional<String> resolution,
      Optional<String> personGeneration,
      Optional<String> pubsubTopic,
      Optional<String> negativePrompt,
      Optional<Boolean> enhancePrompt,
      Optional<Boolean> generateAudio,
      Optional<Image> lastFrame,
      Optional<List<VideoGenerationReferenceImage>> referenceImages,
      Optional<VideoGenerationMask> mask,
      Optional<VideoCompressionQuality> compressionQuality) {
    this.httpOptions = httpOptions;
    this.numberOfVideos = numberOfVideos;
    this.outputGcsUri = outputGcsUri;
    this.fps = fps;
    this.durationSeconds = durationSeconds;
    this.seed = seed;
    this.aspectRatio = aspectRatio;
    this.resolution = resolution;
    this.personGeneration = personGeneration;
    this.pubsubTopic = pubsubTopic;
    this.negativePrompt = negativePrompt;
    this.enhancePrompt = enhancePrompt;
    this.generateAudio = generateAudio;
    this.lastFrame = lastFrame;
    this.referenceImages = referenceImages;
    this.mask = mask;
    this.compressionQuality = compressionQuality;
  }

  @JsonProperty("httpOptions")
  @Override
  public Optional<HttpOptions> httpOptions() {
    return httpOptions;
  }

  @JsonProperty("numberOfVideos")
  @Override
  public Optional<Integer> numberOfVideos() {
    return numberOfVideos;
  }

  @JsonProperty("outputGcsUri")
  @Override
  public Optional<String> outputGcsUri() {
    return outputGcsUri;
  }

  @JsonProperty("fps")
  @Override
  public Optional<Integer> fps() {
    return fps;
  }

  @JsonProperty("durationSeconds")
  @Override
  public Optional<Integer> durationSeconds() {
    return durationSeconds;
  }

  @JsonProperty("seed")
  @Override
  public Optional<Integer> seed() {
    return seed;
  }

  @JsonProperty("aspectRatio")
  @Override
  public Optional<String> aspectRatio() {
    return aspectRatio;
  }

  @JsonProperty("resolution")
  @Override
  public Optional<String> resolution() {
    return resolution;
  }

  @JsonProperty("personGeneration")
  @Override
  public Optional<String> personGeneration() {
    return personGeneration;
  }

  @JsonProperty("pubsubTopic")
  @Override
  public Optional<String> pubsubTopic() {
    return pubsubTopic;
  }

  @JsonProperty("negativePrompt")
  @Override
  public Optional<String> negativePrompt() {
    return negativePrompt;
  }

  @JsonProperty("enhancePrompt")
  @Override
  public Optional<Boolean> enhancePrompt() {
    return enhancePrompt;
  }

  @JsonProperty("generateAudio")
  @Override
  public Optional<Boolean> generateAudio() {
    return generateAudio;
  }

  @JsonProperty("lastFrame")
  @Override
  public Optional<Image> lastFrame() {
    return lastFrame;
  }

  @JsonProperty("referenceImages")
  @Override
  public Optional<List<VideoGenerationReferenceImage>> referenceImages() {
    return referenceImages;
  }

  @JsonProperty("mask")
  @Override
  public Optional<VideoGenerationMask> mask() {
    return mask;
  }

  @JsonProperty("compressionQuality")
  @Override
  public Optional<VideoCompressionQuality> compressionQuality() {
    return compressionQuality;
  }

  @Override
  public String toString() {
    return "GenerateVideosConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "numberOfVideos=" + numberOfVideos + ", "
        + "outputGcsUri=" + outputGcsUri + ", "
        + "fps=" + fps + ", "
        + "durationSeconds=" + durationSeconds + ", "
        + "seed=" + seed + ", "
        + "aspectRatio=" + aspectRatio + ", "
        + "resolution=" + resolution + ", "
        + "personGeneration=" + personGeneration + ", "
        + "pubsubTopic=" + pubsubTopic + ", "
        + "negativePrompt=" + negativePrompt + ", "
        + "enhancePrompt=" + enhancePrompt + ", "
        + "generateAudio=" + generateAudio + ", "
        + "lastFrame=" + lastFrame + ", "
        + "referenceImages=" + referenceImages + ", "
        + "mask=" + mask + ", "
        + "compressionQuality=" + compressionQuality
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GenerateVideosConfig) {
      GenerateVideosConfig that = (GenerateVideosConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.numberOfVideos.equals(that.numberOfVideos())
          && this.outputGcsUri.equals(that.outputGcsUri())
          && this.fps.equals(that.fps())
          && this.durationSeconds.equals(that.durationSeconds())
          && this.seed.equals(that.seed())
          && this.aspectRatio.equals(that.aspectRatio())
          && this.resolution.equals(that.resolution())
          && this.personGeneration.equals(that.personGeneration())
          && this.pubsubTopic.equals(that.pubsubTopic())
          && this.negativePrompt.equals(that.negativePrompt())
          && this.enhancePrompt.equals(that.enhancePrompt())
          && this.generateAudio.equals(that.generateAudio())
          && this.lastFrame.equals(that.lastFrame())
          && this.referenceImages.equals(that.referenceImages())
          && this.mask.equals(that.mask())
          && this.compressionQuality.equals(that.compressionQuality());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= httpOptions.hashCode();
    h$ *= 1000003;
    h$ ^= numberOfVideos.hashCode();
    h$ *= 1000003;
    h$ ^= outputGcsUri.hashCode();
    h$ *= 1000003;
    h$ ^= fps.hashCode();
    h$ *= 1000003;
    h$ ^= durationSeconds.hashCode();
    h$ *= 1000003;
    h$ ^= seed.hashCode();
    h$ *= 1000003;
    h$ ^= aspectRatio.hashCode();
    h$ *= 1000003;
    h$ ^= resolution.hashCode();
    h$ *= 1000003;
    h$ ^= personGeneration.hashCode();
    h$ *= 1000003;
    h$ ^= pubsubTopic.hashCode();
    h$ *= 1000003;
    h$ ^= negativePrompt.hashCode();
    h$ *= 1000003;
    h$ ^= enhancePrompt.hashCode();
    h$ *= 1000003;
    h$ ^= generateAudio.hashCode();
    h$ *= 1000003;
    h$ ^= lastFrame.hashCode();
    h$ *= 1000003;
    h$ ^= referenceImages.hashCode();
    h$ *= 1000003;
    h$ ^= mask.hashCode();
    h$ *= 1000003;
    h$ ^= compressionQuality.hashCode();
    return h$;
  }

  @Override
  public GenerateVideosConfig.Builder toBuilder() {
    return new AutoValue_GenerateVideosConfig.Builder(this);
  }

  static final class Builder extends GenerateVideosConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<Integer> numberOfVideos = Optional.empty();
    private Optional<String> outputGcsUri = Optional.empty();
    private Optional<Integer> fps = Optional.empty();
    private Optional<Integer> durationSeconds = Optional.empty();
    private Optional<Integer> seed = Optional.empty();
    private Optional<String> aspectRatio = Optional.empty();
    private Optional<String> resolution = Optional.empty();
    private Optional<String> personGeneration = Optional.empty();
    private Optional<String> pubsubTopic = Optional.empty();
    private Optional<String> negativePrompt = Optional.empty();
    private Optional<Boolean> enhancePrompt = Optional.empty();
    private Optional<Boolean> generateAudio = Optional.empty();
    private Optional<Image> lastFrame = Optional.empty();
    private Optional<List<VideoGenerationReferenceImage>> referenceImages = Optional.empty();
    private Optional<VideoGenerationMask> mask = Optional.empty();
    private Optional<VideoCompressionQuality> compressionQuality = Optional.empty();
    Builder() {
    }
    Builder(GenerateVideosConfig source) {
      this.httpOptions = source.httpOptions();
      this.numberOfVideos = source.numberOfVideos();
      this.outputGcsUri = source.outputGcsUri();
      this.fps = source.fps();
      this.durationSeconds = source.durationSeconds();
      this.seed = source.seed();
      this.aspectRatio = source.aspectRatio();
      this.resolution = source.resolution();
      this.personGeneration = source.personGeneration();
      this.pubsubTopic = source.pubsubTopic();
      this.negativePrompt = source.negativePrompt();
      this.enhancePrompt = source.enhancePrompt();
      this.generateAudio = source.generateAudio();
      this.lastFrame = source.lastFrame();
      this.referenceImages = source.referenceImages();
      this.mask = source.mask();
      this.compressionQuality = source.compressionQuality();
    }
    @Override
    public GenerateVideosConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    GenerateVideosConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public GenerateVideosConfig.Builder numberOfVideos(Integer numberOfVideos) {
      this.numberOfVideos = Optional.of(numberOfVideos);
      return this;
    }
    @Override
    GenerateVideosConfig.Builder numberOfVideos(Optional<Integer> numberOfVideos) {
      if (numberOfVideos == null) {
        throw new NullPointerException("Null numberOfVideos");
      }
      this.numberOfVideos = numberOfVideos;
      return this;
    }
    @Override
    public GenerateVideosConfig.Builder outputGcsUri(String outputGcsUri) {
      this.outputGcsUri = Optional.of(outputGcsUri);
      return this;
    }
    @Override
    GenerateVideosConfig.Builder outputGcsUri(Optional<String> outputGcsUri) {
      if (outputGcsUri == null) {
        throw new NullPointerException("Null outputGcsUri");
      }
      this.outputGcsUri = outputGcsUri;
      return this;
    }
    @Override
    public GenerateVideosConfig.Builder fps(Integer fps) {
      this.fps = Optional.of(fps);
      return this;
    }
    @Override
    GenerateVideosConfig.Builder fps(Optional<Integer> fps) {
      if (fps == null) {
        throw new NullPointerException("Null fps");
      }
      this.fps = fps;
      return this;
    }
    @Override
    public GenerateVideosConfig.Builder durationSeconds(Integer durationSeconds) {
      this.durationSeconds = Optional.of(durationSeconds);
      return this;
    }
    @Override
    GenerateVideosConfig.Builder durationSeconds(Optional<Integer> durationSeconds) {
      if (durationSeconds == null) {
        throw new NullPointerException("Null durationSeconds");
      }
      this.durationSeconds = durationSeconds;
      return this;
    }
    @Override
    public GenerateVideosConfig.Builder seed(Integer seed) {
      this.seed = Optional.of(seed);
      return this;
    }
    @Override
    GenerateVideosConfig.Builder seed(Optional<Integer> seed) {
      if (seed == null) {
        throw new NullPointerException("Null seed");
      }
      this.seed = seed;
      return this;
    }
    @Override
    public GenerateVideosConfig.Builder aspectRatio(String aspectRatio) {
      this.aspectRatio = Optional.of(aspectRatio);
      return this;
    }
    @Override
    GenerateVideosConfig.Builder aspectRatio(Optional<String> aspectRatio) {
      if (aspectRatio == null) {
        throw new NullPointerException("Null aspectRatio");
      }
      this.aspectRatio = aspectRatio;
      return this;
    }
    @Override
    public GenerateVideosConfig.Builder resolution(String resolution) {
      this.resolution = Optional.of(resolution);
      return this;
    }
    @Override
    GenerateVideosConfig.Builder resolution(Optional<String> resolution) {
      if (resolution == null) {
        throw new NullPointerException("Null resolution");
      }
      this.resolution = resolution;
      return this;
    }
    @Override
    public GenerateVideosConfig.Builder personGeneration(String personGeneration) {
      this.personGeneration = Optional.of(personGeneration);
      return this;
    }
    @Override
    GenerateVideosConfig.Builder personGeneration(Optional<String> personGeneration) {
      if (personGeneration == null) {
        throw new NullPointerException("Null personGeneration");
      }
      this.personGeneration = personGeneration;
      return this;
    }
    @Override
    public GenerateVideosConfig.Builder pubsubTopic(String pubsubTopic) {
      this.pubsubTopic = Optional.of(pubsubTopic);
      return this;
    }
    @Override
    GenerateVideosConfig.Builder pubsubTopic(Optional<String> pubsubTopic) {
      if (pubsubTopic == null) {
        throw new NullPointerException("Null pubsubTopic");
      }
      this.pubsubTopic = pubsubTopic;
      return this;
    }
    @Override
    public GenerateVideosConfig.Builder negativePrompt(String negativePrompt) {
      this.negativePrompt = Optional.of(negativePrompt);
      return this;
    }
    @Override
    GenerateVideosConfig.Builder negativePrompt(Optional<String> negativePrompt) {
      if (negativePrompt == null) {
        throw new NullPointerException("Null negativePrompt");
      }
      this.negativePrompt = negativePrompt;
      return this;
    }
    @Override
    public GenerateVideosConfig.Builder enhancePrompt(boolean enhancePrompt) {
      this.enhancePrompt = Optional.of(enhancePrompt);
      return this;
    }
    @Override
    GenerateVideosConfig.Builder enhancePrompt(Optional<Boolean> enhancePrompt) {
      if (enhancePrompt == null) {
        throw new NullPointerException("Null enhancePrompt");
      }
      this.enhancePrompt = enhancePrompt;
      return this;
    }
    @Override
    public GenerateVideosConfig.Builder generateAudio(boolean generateAudio) {
      this.generateAudio = Optional.of(generateAudio);
      return this;
    }
    @Override
    GenerateVideosConfig.Builder generateAudio(Optional<Boolean> generateAudio) {
      if (generateAudio == null) {
        throw new NullPointerException("Null generateAudio");
      }
      this.generateAudio = generateAudio;
      return this;
    }
    @Override
    public GenerateVideosConfig.Builder lastFrame(Image lastFrame) {
      this.lastFrame = Optional.of(lastFrame);
      return this;
    }
    @Override
    GenerateVideosConfig.Builder lastFrame(Optional<Image> lastFrame) {
      if (lastFrame == null) {
        throw new NullPointerException("Null lastFrame");
      }
      this.lastFrame = lastFrame;
      return this;
    }
    @Override
    public GenerateVideosConfig.Builder referenceImages(List<VideoGenerationReferenceImage> referenceImages) {
      this.referenceImages = Optional.of(referenceImages);
      return this;
    }
    @Override
    GenerateVideosConfig.Builder referenceImages(Optional<List<VideoGenerationReferenceImage>> referenceImages) {
      if (referenceImages == null) {
        throw new NullPointerException("Null referenceImages");
      }
      this.referenceImages = referenceImages;
      return this;
    }
    @Override
    public GenerateVideosConfig.Builder mask(VideoGenerationMask mask) {
      this.mask = Optional.of(mask);
      return this;
    }
    @Override
    GenerateVideosConfig.Builder mask(Optional<VideoGenerationMask> mask) {
      if (mask == null) {
        throw new NullPointerException("Null mask");
      }
      this.mask = mask;
      return this;
    }
    @Override
    public GenerateVideosConfig.Builder compressionQuality(VideoCompressionQuality compressionQuality) {
      this.compressionQuality = Optional.of(compressionQuality);
      return this;
    }
    @Override
    GenerateVideosConfig.Builder compressionQuality(Optional<VideoCompressionQuality> compressionQuality) {
      if (compressionQuality == null) {
        throw new NullPointerException("Null compressionQuality");
      }
      this.compressionQuality = compressionQuality;
      return this;
    }
    @Override
    public GenerateVideosConfig build() {
      return new AutoValue_GenerateVideosConfig(
          this.httpOptions,
          this.numberOfVideos,
          this.outputGcsUri,
          this.fps,
          this.durationSeconds,
          this.seed,
          this.aspectRatio,
          this.resolution,
          this.personGeneration,
          this.pubsubTopic,
          this.negativePrompt,
          this.enhancePrompt,
          this.generateAudio,
          this.lastFrame,
          this.referenceImages,
          this.mask,
          this.compressionQuality);
    }
  }

}
