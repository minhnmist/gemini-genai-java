package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_PreferenceOptimizationHyperParameters extends PreferenceOptimizationHyperParameters {

  private final Optional<AdapterSize> adapterSize;

  private final Optional<Double> beta;

  private final Optional<Long> epochCount;

  private final Optional<Double> learningRateMultiplier;

  private AutoValue_PreferenceOptimizationHyperParameters(
      Optional<AdapterSize> adapterSize,
      Optional<Double> beta,
      Optional<Long> epochCount,
      Optional<Double> learningRateMultiplier) {
    this.adapterSize = adapterSize;
    this.beta = beta;
    this.epochCount = epochCount;
    this.learningRateMultiplier = learningRateMultiplier;
  }

  @JsonProperty("adapterSize")
  @Override
  public Optional<AdapterSize> adapterSize() {
    return adapterSize;
  }

  @JsonProperty("beta")
  @Override
  public Optional<Double> beta() {
    return beta;
  }

  @JsonProperty("epochCount")
  @Override
  public Optional<Long> epochCount() {
    return epochCount;
  }

  @JsonProperty("learningRateMultiplier")
  @Override
  public Optional<Double> learningRateMultiplier() {
    return learningRateMultiplier;
  }

  @Override
  public String toString() {
    return "PreferenceOptimizationHyperParameters{"
        + "adapterSize=" + adapterSize + ", "
        + "beta=" + beta + ", "
        + "epochCount=" + epochCount + ", "
        + "learningRateMultiplier=" + learningRateMultiplier
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PreferenceOptimizationHyperParameters) {
      PreferenceOptimizationHyperParameters that = (PreferenceOptimizationHyperParameters) o;
      return this.adapterSize.equals(that.adapterSize())
          && this.beta.equals(that.beta())
          && this.epochCount.equals(that.epochCount())
          && this.learningRateMultiplier.equals(that.learningRateMultiplier());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= adapterSize.hashCode();
    h$ *= 1000003;
    h$ ^= beta.hashCode();
    h$ *= 1000003;
    h$ ^= epochCount.hashCode();
    h$ *= 1000003;
    h$ ^= learningRateMultiplier.hashCode();
    return h$;
  }

  @Override
  public PreferenceOptimizationHyperParameters.Builder toBuilder() {
    return new AutoValue_PreferenceOptimizationHyperParameters.Builder(this);
  }

  static final class Builder extends PreferenceOptimizationHyperParameters.Builder {
    private Optional<AdapterSize> adapterSize = Optional.empty();
    private Optional<Double> beta = Optional.empty();
    private Optional<Long> epochCount = Optional.empty();
    private Optional<Double> learningRateMultiplier = Optional.empty();
    Builder() {
    }
    Builder(PreferenceOptimizationHyperParameters source) {
      this.adapterSize = source.adapterSize();
      this.beta = source.beta();
      this.epochCount = source.epochCount();
      this.learningRateMultiplier = source.learningRateMultiplier();
    }
    @Override
    public PreferenceOptimizationHyperParameters.Builder adapterSize(AdapterSize adapterSize) {
      this.adapterSize = Optional.of(adapterSize);
      return this;
    }
    @Override
    PreferenceOptimizationHyperParameters.Builder adapterSize(Optional<AdapterSize> adapterSize) {
      if (adapterSize == null) {
        throw new NullPointerException("Null adapterSize");
      }
      this.adapterSize = adapterSize;
      return this;
    }
    @Override
    public PreferenceOptimizationHyperParameters.Builder beta(Double beta) {
      this.beta = Optional.of(beta);
      return this;
    }
    @Override
    PreferenceOptimizationHyperParameters.Builder beta(Optional<Double> beta) {
      if (beta == null) {
        throw new NullPointerException("Null beta");
      }
      this.beta = beta;
      return this;
    }
    @Override
    public PreferenceOptimizationHyperParameters.Builder epochCount(Long epochCount) {
      this.epochCount = Optional.of(epochCount);
      return this;
    }
    @Override
    PreferenceOptimizationHyperParameters.Builder epochCount(Optional<Long> epochCount) {
      if (epochCount == null) {
        throw new NullPointerException("Null epochCount");
      }
      this.epochCount = epochCount;
      return this;
    }
    @Override
    public PreferenceOptimizationHyperParameters.Builder learningRateMultiplier(Double learningRateMultiplier) {
      this.learningRateMultiplier = Optional.of(learningRateMultiplier);
      return this;
    }
    @Override
    PreferenceOptimizationHyperParameters.Builder learningRateMultiplier(Optional<Double> learningRateMultiplier) {
      if (learningRateMultiplier == null) {
        throw new NullPointerException("Null learningRateMultiplier");
      }
      this.learningRateMultiplier = learningRateMultiplier;
      return this;
    }
    @Override
    public PreferenceOptimizationHyperParameters build() {
      return new AutoValue_PreferenceOptimizationHyperParameters(
          this.adapterSize,
          this.beta,
          this.epochCount,
          this.learningRateMultiplier);
    }
  }

}
