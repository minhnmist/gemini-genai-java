package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SupervisedHyperParameters extends SupervisedHyperParameters {

  private final Optional<AdapterSize> adapterSize;

  private final Optional<Long> batchSize;

  private final Optional<Long> epochCount;

  private final Optional<Double> learningRate;

  private final Optional<Double> learningRateMultiplier;

  private AutoValue_SupervisedHyperParameters(
      Optional<AdapterSize> adapterSize,
      Optional<Long> batchSize,
      Optional<Long> epochCount,
      Optional<Double> learningRate,
      Optional<Double> learningRateMultiplier) {
    this.adapterSize = adapterSize;
    this.batchSize = batchSize;
    this.epochCount = epochCount;
    this.learningRate = learningRate;
    this.learningRateMultiplier = learningRateMultiplier;
  }

  @JsonProperty("adapterSize")
  @Override
  public Optional<AdapterSize> adapterSize() {
    return adapterSize;
  }

  @JsonProperty("batchSize")
  @Override
  public Optional<Long> batchSize() {
    return batchSize;
  }

  @JsonProperty("epochCount")
  @Override
  public Optional<Long> epochCount() {
    return epochCount;
  }

  @JsonProperty("learningRate")
  @Override
  public Optional<Double> learningRate() {
    return learningRate;
  }

  @JsonProperty("learningRateMultiplier")
  @Override
  public Optional<Double> learningRateMultiplier() {
    return learningRateMultiplier;
  }

  @Override
  public String toString() {
    return "SupervisedHyperParameters{"
        + "adapterSize=" + adapterSize + ", "
        + "batchSize=" + batchSize + ", "
        + "epochCount=" + epochCount + ", "
        + "learningRate=" + learningRate + ", "
        + "learningRateMultiplier=" + learningRateMultiplier
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SupervisedHyperParameters) {
      SupervisedHyperParameters that = (SupervisedHyperParameters) o;
      return this.adapterSize.equals(that.adapterSize())
          && this.batchSize.equals(that.batchSize())
          && this.epochCount.equals(that.epochCount())
          && this.learningRate.equals(that.learningRate())
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
    h$ ^= batchSize.hashCode();
    h$ *= 1000003;
    h$ ^= epochCount.hashCode();
    h$ *= 1000003;
    h$ ^= learningRate.hashCode();
    h$ *= 1000003;
    h$ ^= learningRateMultiplier.hashCode();
    return h$;
  }

  @Override
  public SupervisedHyperParameters.Builder toBuilder() {
    return new AutoValue_SupervisedHyperParameters.Builder(this);
  }

  static final class Builder extends SupervisedHyperParameters.Builder {
    private Optional<AdapterSize> adapterSize = Optional.empty();
    private Optional<Long> batchSize = Optional.empty();
    private Optional<Long> epochCount = Optional.empty();
    private Optional<Double> learningRate = Optional.empty();
    private Optional<Double> learningRateMultiplier = Optional.empty();
    Builder() {
    }
    Builder(SupervisedHyperParameters source) {
      this.adapterSize = source.adapterSize();
      this.batchSize = source.batchSize();
      this.epochCount = source.epochCount();
      this.learningRate = source.learningRate();
      this.learningRateMultiplier = source.learningRateMultiplier();
    }
    @Override
    public SupervisedHyperParameters.Builder adapterSize(AdapterSize adapterSize) {
      this.adapterSize = Optional.of(adapterSize);
      return this;
    }
    @Override
    SupervisedHyperParameters.Builder adapterSize(Optional<AdapterSize> adapterSize) {
      if (adapterSize == null) {
        throw new NullPointerException("Null adapterSize");
      }
      this.adapterSize = adapterSize;
      return this;
    }
    @Override
    public SupervisedHyperParameters.Builder batchSize(Long batchSize) {
      this.batchSize = Optional.of(batchSize);
      return this;
    }
    @Override
    SupervisedHyperParameters.Builder batchSize(Optional<Long> batchSize) {
      if (batchSize == null) {
        throw new NullPointerException("Null batchSize");
      }
      this.batchSize = batchSize;
      return this;
    }
    @Override
    public SupervisedHyperParameters.Builder epochCount(Long epochCount) {
      this.epochCount = Optional.of(epochCount);
      return this;
    }
    @Override
    SupervisedHyperParameters.Builder epochCount(Optional<Long> epochCount) {
      if (epochCount == null) {
        throw new NullPointerException("Null epochCount");
      }
      this.epochCount = epochCount;
      return this;
    }
    @Override
    public SupervisedHyperParameters.Builder learningRate(Double learningRate) {
      this.learningRate = Optional.of(learningRate);
      return this;
    }
    @Override
    SupervisedHyperParameters.Builder learningRate(Optional<Double> learningRate) {
      if (learningRate == null) {
        throw new NullPointerException("Null learningRate");
      }
      this.learningRate = learningRate;
      return this;
    }
    @Override
    public SupervisedHyperParameters.Builder learningRateMultiplier(Double learningRateMultiplier) {
      this.learningRateMultiplier = Optional.of(learningRateMultiplier);
      return this;
    }
    @Override
    SupervisedHyperParameters.Builder learningRateMultiplier(Optional<Double> learningRateMultiplier) {
      if (learningRateMultiplier == null) {
        throw new NullPointerException("Null learningRateMultiplier");
      }
      this.learningRateMultiplier = learningRateMultiplier;
      return this;
    }
    @Override
    public SupervisedHyperParameters build() {
      return new AutoValue_SupervisedHyperParameters(
          this.adapterSize,
          this.batchSize,
          this.epochCount,
          this.learningRate,
          this.learningRateMultiplier);
    }
  }

}
