package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_VertexRagStore extends VertexRagStore {

  private final Optional<List<String>> ragCorpora;

  private final Optional<List<VertexRagStoreRagResource>> ragResources;

  private final Optional<RagRetrievalConfig> ragRetrievalConfig;

  private final Optional<Integer> similarityTopK;

  private final Optional<Boolean> storeContext;

  private final Optional<Double> vectorDistanceThreshold;

  private AutoValue_VertexRagStore(
      Optional<List<String>> ragCorpora,
      Optional<List<VertexRagStoreRagResource>> ragResources,
      Optional<RagRetrievalConfig> ragRetrievalConfig,
      Optional<Integer> similarityTopK,
      Optional<Boolean> storeContext,
      Optional<Double> vectorDistanceThreshold) {
    this.ragCorpora = ragCorpora;
    this.ragResources = ragResources;
    this.ragRetrievalConfig = ragRetrievalConfig;
    this.similarityTopK = similarityTopK;
    this.storeContext = storeContext;
    this.vectorDistanceThreshold = vectorDistanceThreshold;
  }

  @JsonProperty("ragCorpora")
  @Override
  public Optional<List<String>> ragCorpora() {
    return ragCorpora;
  }

  @JsonProperty("ragResources")
  @Override
  public Optional<List<VertexRagStoreRagResource>> ragResources() {
    return ragResources;
  }

  @JsonProperty("ragRetrievalConfig")
  @Override
  public Optional<RagRetrievalConfig> ragRetrievalConfig() {
    return ragRetrievalConfig;
  }

  @JsonProperty("similarityTopK")
  @Override
  public Optional<Integer> similarityTopK() {
    return similarityTopK;
  }

  @JsonProperty("storeContext")
  @Override
  public Optional<Boolean> storeContext() {
    return storeContext;
  }

  @JsonProperty("vectorDistanceThreshold")
  @Override
  public Optional<Double> vectorDistanceThreshold() {
    return vectorDistanceThreshold;
  }

  @Override
  public String toString() {
    return "VertexRagStore{"
        + "ragCorpora=" + ragCorpora + ", "
        + "ragResources=" + ragResources + ", "
        + "ragRetrievalConfig=" + ragRetrievalConfig + ", "
        + "similarityTopK=" + similarityTopK + ", "
        + "storeContext=" + storeContext + ", "
        + "vectorDistanceThreshold=" + vectorDistanceThreshold
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof VertexRagStore) {
      VertexRagStore that = (VertexRagStore) o;
      return this.ragCorpora.equals(that.ragCorpora())
          && this.ragResources.equals(that.ragResources())
          && this.ragRetrievalConfig.equals(that.ragRetrievalConfig())
          && this.similarityTopK.equals(that.similarityTopK())
          && this.storeContext.equals(that.storeContext())
          && this.vectorDistanceThreshold.equals(that.vectorDistanceThreshold());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= ragCorpora.hashCode();
    h$ *= 1000003;
    h$ ^= ragResources.hashCode();
    h$ *= 1000003;
    h$ ^= ragRetrievalConfig.hashCode();
    h$ *= 1000003;
    h$ ^= similarityTopK.hashCode();
    h$ *= 1000003;
    h$ ^= storeContext.hashCode();
    h$ *= 1000003;
    h$ ^= vectorDistanceThreshold.hashCode();
    return h$;
  }

  @Override
  public VertexRagStore.Builder toBuilder() {
    return new AutoValue_VertexRagStore.Builder(this);
  }

  static final class Builder extends VertexRagStore.Builder {
    private Optional<List<String>> ragCorpora = Optional.empty();
    private Optional<List<VertexRagStoreRagResource>> ragResources = Optional.empty();
    private Optional<RagRetrievalConfig> ragRetrievalConfig = Optional.empty();
    private Optional<Integer> similarityTopK = Optional.empty();
    private Optional<Boolean> storeContext = Optional.empty();
    private Optional<Double> vectorDistanceThreshold = Optional.empty();
    Builder() {
    }
    Builder(VertexRagStore source) {
      this.ragCorpora = source.ragCorpora();
      this.ragResources = source.ragResources();
      this.ragRetrievalConfig = source.ragRetrievalConfig();
      this.similarityTopK = source.similarityTopK();
      this.storeContext = source.storeContext();
      this.vectorDistanceThreshold = source.vectorDistanceThreshold();
    }
    @Override
    public VertexRagStore.Builder ragCorpora(List<String> ragCorpora) {
      this.ragCorpora = Optional.of(ragCorpora);
      return this;
    }
    @Override
    VertexRagStore.Builder ragCorpora(Optional<List<String>> ragCorpora) {
      if (ragCorpora == null) {
        throw new NullPointerException("Null ragCorpora");
      }
      this.ragCorpora = ragCorpora;
      return this;
    }
    @Override
    public VertexRagStore.Builder ragResources(List<VertexRagStoreRagResource> ragResources) {
      this.ragResources = Optional.of(ragResources);
      return this;
    }
    @Override
    VertexRagStore.Builder ragResources(Optional<List<VertexRagStoreRagResource>> ragResources) {
      if (ragResources == null) {
        throw new NullPointerException("Null ragResources");
      }
      this.ragResources = ragResources;
      return this;
    }
    @Override
    public VertexRagStore.Builder ragRetrievalConfig(RagRetrievalConfig ragRetrievalConfig) {
      this.ragRetrievalConfig = Optional.of(ragRetrievalConfig);
      return this;
    }
    @Override
    VertexRagStore.Builder ragRetrievalConfig(Optional<RagRetrievalConfig> ragRetrievalConfig) {
      if (ragRetrievalConfig == null) {
        throw new NullPointerException("Null ragRetrievalConfig");
      }
      this.ragRetrievalConfig = ragRetrievalConfig;
      return this;
    }
    @Override
    public VertexRagStore.Builder similarityTopK(Integer similarityTopK) {
      this.similarityTopK = Optional.of(similarityTopK);
      return this;
    }
    @Override
    VertexRagStore.Builder similarityTopK(Optional<Integer> similarityTopK) {
      if (similarityTopK == null) {
        throw new NullPointerException("Null similarityTopK");
      }
      this.similarityTopK = similarityTopK;
      return this;
    }
    @Override
    public VertexRagStore.Builder storeContext(boolean storeContext) {
      this.storeContext = Optional.of(storeContext);
      return this;
    }
    @Override
    VertexRagStore.Builder storeContext(Optional<Boolean> storeContext) {
      if (storeContext == null) {
        throw new NullPointerException("Null storeContext");
      }
      this.storeContext = storeContext;
      return this;
    }
    @Override
    public VertexRagStore.Builder vectorDistanceThreshold(Double vectorDistanceThreshold) {
      this.vectorDistanceThreshold = Optional.of(vectorDistanceThreshold);
      return this;
    }
    @Override
    VertexRagStore.Builder vectorDistanceThreshold(Optional<Double> vectorDistanceThreshold) {
      if (vectorDistanceThreshold == null) {
        throw new NullPointerException("Null vectorDistanceThreshold");
      }
      this.vectorDistanceThreshold = vectorDistanceThreshold;
      return this;
    }
    @Override
    public VertexRagStore build() {
      return new AutoValue_VertexRagStore(
          this.ragCorpora,
          this.ragResources,
          this.ragRetrievalConfig,
          this.similarityTopK,
          this.storeContext,
          this.vectorDistanceThreshold);
    }
  }

}
