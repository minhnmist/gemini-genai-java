package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Schema extends Schema {

  private final Optional<List<Schema>> anyOf;

  private final Optional<Object> default_;

  private final Optional<String> description;

  private final Optional<List<String>> enum_;

  private final Optional<Object> example;

  private final Optional<String> format;

  private final Optional<Schema> items;

  private final Optional<Long> maxItems;

  private final Optional<Long> maxLength;

  private final Optional<Long> maxProperties;

  private final Optional<Double> maximum;

  private final Optional<Long> minItems;

  private final Optional<Long> minLength;

  private final Optional<Long> minProperties;

  private final Optional<Double> minimum;

  private final Optional<Boolean> nullable;

  private final Optional<String> pattern;

  private final Optional<Map<String, Schema>> properties;

  private final Optional<List<String>> propertyOrdering;

  private final Optional<List<String>> required;

  private final Optional<String> title;

  private final Optional<Type> type;

  private AutoValue_Schema(
      Optional<List<Schema>> anyOf,
      Optional<Object> default_,
      Optional<String> description,
      Optional<List<String>> enum_,
      Optional<Object> example,
      Optional<String> format,
      Optional<Schema> items,
      Optional<Long> maxItems,
      Optional<Long> maxLength,
      Optional<Long> maxProperties,
      Optional<Double> maximum,
      Optional<Long> minItems,
      Optional<Long> minLength,
      Optional<Long> minProperties,
      Optional<Double> minimum,
      Optional<Boolean> nullable,
      Optional<String> pattern,
      Optional<Map<String, Schema>> properties,
      Optional<List<String>> propertyOrdering,
      Optional<List<String>> required,
      Optional<String> title,
      Optional<Type> type) {
    this.anyOf = anyOf;
    this.default_ = default_;
    this.description = description;
    this.enum_ = enum_;
    this.example = example;
    this.format = format;
    this.items = items;
    this.maxItems = maxItems;
    this.maxLength = maxLength;
    this.maxProperties = maxProperties;
    this.maximum = maximum;
    this.minItems = minItems;
    this.minLength = minLength;
    this.minProperties = minProperties;
    this.minimum = minimum;
    this.nullable = nullable;
    this.pattern = pattern;
    this.properties = properties;
    this.propertyOrdering = propertyOrdering;
    this.required = required;
    this.title = title;
    this.type = type;
  }

  @JsonProperty("anyOf")
  @Override
  public Optional<List<Schema>> anyOf() {
    return anyOf;
  }

  @JsonProperty("default")
  @Override
  public Optional<Object> default_() {
    return default_;
  }

  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return description;
  }

  @JsonProperty("enum")
  @Override
  public Optional<List<String>> enum_() {
    return enum_;
  }

  @JsonProperty("example")
  @Override
  public Optional<Object> example() {
    return example;
  }

  @JsonProperty("format")
  @Override
  public Optional<String> format() {
    return format;
  }

  @JsonProperty("items")
  @Override
  public Optional<Schema> items() {
    return items;
  }

  @JsonProperty("maxItems")
  @Override
  public Optional<Long> maxItems() {
    return maxItems;
  }

  @JsonProperty("maxLength")
  @Override
  public Optional<Long> maxLength() {
    return maxLength;
  }

  @JsonProperty("maxProperties")
  @Override
  public Optional<Long> maxProperties() {
    return maxProperties;
  }

  @JsonProperty("maximum")
  @Override
  public Optional<Double> maximum() {
    return maximum;
  }

  @JsonProperty("minItems")
  @Override
  public Optional<Long> minItems() {
    return minItems;
  }

  @JsonProperty("minLength")
  @Override
  public Optional<Long> minLength() {
    return minLength;
  }

  @JsonProperty("minProperties")
  @Override
  public Optional<Long> minProperties() {
    return minProperties;
  }

  @JsonProperty("minimum")
  @Override
  public Optional<Double> minimum() {
    return minimum;
  }

  @JsonProperty("nullable")
  @Override
  public Optional<Boolean> nullable() {
    return nullable;
  }

  @JsonProperty("pattern")
  @Override
  public Optional<String> pattern() {
    return pattern;
  }

  @JsonProperty("properties")
  @Override
  public Optional<Map<String, Schema>> properties() {
    return properties;
  }

  @JsonProperty("propertyOrdering")
  @Override
  public Optional<List<String>> propertyOrdering() {
    return propertyOrdering;
  }

  @JsonProperty("required")
  @Override
  public Optional<List<String>> required() {
    return required;
  }

  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return title;
  }

  @JsonProperty("type")
  @Override
  public Optional<Type> type() {
    return type;
  }

  @Override
  public String toString() {
    return "Schema{"
        + "anyOf=" + anyOf + ", "
        + "default_=" + default_ + ", "
        + "description=" + description + ", "
        + "enum_=" + enum_ + ", "
        + "example=" + example + ", "
        + "format=" + format + ", "
        + "items=" + items + ", "
        + "maxItems=" + maxItems + ", "
        + "maxLength=" + maxLength + ", "
        + "maxProperties=" + maxProperties + ", "
        + "maximum=" + maximum + ", "
        + "minItems=" + minItems + ", "
        + "minLength=" + minLength + ", "
        + "minProperties=" + minProperties + ", "
        + "minimum=" + minimum + ", "
        + "nullable=" + nullable + ", "
        + "pattern=" + pattern + ", "
        + "properties=" + properties + ", "
        + "propertyOrdering=" + propertyOrdering + ", "
        + "required=" + required + ", "
        + "title=" + title + ", "
        + "type=" + type
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Schema) {
      Schema that = (Schema) o;
      return this.anyOf.equals(that.anyOf())
          && this.default_.equals(that.default_())
          && this.description.equals(that.description())
          && this.enum_.equals(that.enum_())
          && this.example.equals(that.example())
          && this.format.equals(that.format())
          && this.items.equals(that.items())
          && this.maxItems.equals(that.maxItems())
          && this.maxLength.equals(that.maxLength())
          && this.maxProperties.equals(that.maxProperties())
          && this.maximum.equals(that.maximum())
          && this.minItems.equals(that.minItems())
          && this.minLength.equals(that.minLength())
          && this.minProperties.equals(that.minProperties())
          && this.minimum.equals(that.minimum())
          && this.nullable.equals(that.nullable())
          && this.pattern.equals(that.pattern())
          && this.properties.equals(that.properties())
          && this.propertyOrdering.equals(that.propertyOrdering())
          && this.required.equals(that.required())
          && this.title.equals(that.title())
          && this.type.equals(that.type());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= anyOf.hashCode();
    h$ *= 1000003;
    h$ ^= default_.hashCode();
    h$ *= 1000003;
    h$ ^= description.hashCode();
    h$ *= 1000003;
    h$ ^= enum_.hashCode();
    h$ *= 1000003;
    h$ ^= example.hashCode();
    h$ *= 1000003;
    h$ ^= format.hashCode();
    h$ *= 1000003;
    h$ ^= items.hashCode();
    h$ *= 1000003;
    h$ ^= maxItems.hashCode();
    h$ *= 1000003;
    h$ ^= maxLength.hashCode();
    h$ *= 1000003;
    h$ ^= maxProperties.hashCode();
    h$ *= 1000003;
    h$ ^= maximum.hashCode();
    h$ *= 1000003;
    h$ ^= minItems.hashCode();
    h$ *= 1000003;
    h$ ^= minLength.hashCode();
    h$ *= 1000003;
    h$ ^= minProperties.hashCode();
    h$ *= 1000003;
    h$ ^= minimum.hashCode();
    h$ *= 1000003;
    h$ ^= nullable.hashCode();
    h$ *= 1000003;
    h$ ^= pattern.hashCode();
    h$ *= 1000003;
    h$ ^= properties.hashCode();
    h$ *= 1000003;
    h$ ^= propertyOrdering.hashCode();
    h$ *= 1000003;
    h$ ^= required.hashCode();
    h$ *= 1000003;
    h$ ^= title.hashCode();
    h$ *= 1000003;
    h$ ^= type.hashCode();
    return h$;
  }

  @Override
  public Schema.Builder toBuilder() {
    return new AutoValue_Schema.Builder(this);
  }

  static final class Builder extends Schema.Builder {
    private Optional<List<Schema>> anyOf = Optional.empty();
    private Optional<Object> default_ = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Optional<List<String>> enum_ = Optional.empty();
    private Optional<Object> example = Optional.empty();
    private Optional<String> format = Optional.empty();
    private Optional<Schema> items = Optional.empty();
    private Optional<Long> maxItems = Optional.empty();
    private Optional<Long> maxLength = Optional.empty();
    private Optional<Long> maxProperties = Optional.empty();
    private Optional<Double> maximum = Optional.empty();
    private Optional<Long> minItems = Optional.empty();
    private Optional<Long> minLength = Optional.empty();
    private Optional<Long> minProperties = Optional.empty();
    private Optional<Double> minimum = Optional.empty();
    private Optional<Boolean> nullable = Optional.empty();
    private Optional<String> pattern = Optional.empty();
    private Optional<Map<String, Schema>> properties = Optional.empty();
    private Optional<List<String>> propertyOrdering = Optional.empty();
    private Optional<List<String>> required = Optional.empty();
    private Optional<String> title = Optional.empty();
    private Optional<Type> type = Optional.empty();
    Builder() {
    }
    Builder(Schema source) {
      this.anyOf = source.anyOf();
      this.default_ = source.default_();
      this.description = source.description();
      this.enum_ = source.enum_();
      this.example = source.example();
      this.format = source.format();
      this.items = source.items();
      this.maxItems = source.maxItems();
      this.maxLength = source.maxLength();
      this.maxProperties = source.maxProperties();
      this.maximum = source.maximum();
      this.minItems = source.minItems();
      this.minLength = source.minLength();
      this.minProperties = source.minProperties();
      this.minimum = source.minimum();
      this.nullable = source.nullable();
      this.pattern = source.pattern();
      this.properties = source.properties();
      this.propertyOrdering = source.propertyOrdering();
      this.required = source.required();
      this.title = source.title();
      this.type = source.type();
    }
    @Override
    public Schema.Builder anyOf(List<Schema> anyOf) {
      this.anyOf = Optional.of(anyOf);
      return this;
    }
    @Override
    Schema.Builder anyOf(Optional<List<Schema>> anyOf) {
      if (anyOf == null) {
        throw new NullPointerException("Null anyOf");
      }
      this.anyOf = anyOf;
      return this;
    }
    @Override
    public Schema.Builder default_(Object default_) {
      this.default_ = Optional.of(default_);
      return this;
    }
    @Override
    Schema.Builder default_(Optional<Object> default_) {
      if (default_ == null) {
        throw new NullPointerException("Null default_");
      }
      this.default_ = default_;
      return this;
    }
    @Override
    public Schema.Builder description(String description) {
      this.description = Optional.of(description);
      return this;
    }
    @Override
    Schema.Builder description(Optional<String> description) {
      if (description == null) {
        throw new NullPointerException("Null description");
      }
      this.description = description;
      return this;
    }
    @Override
    public Schema.Builder enum_(List<String> enum_) {
      this.enum_ = Optional.of(enum_);
      return this;
    }
    @Override
    Schema.Builder enum_(Optional<List<String>> enum_) {
      if (enum_ == null) {
        throw new NullPointerException("Null enum_");
      }
      this.enum_ = enum_;
      return this;
    }
    @Override
    public Schema.Builder example(Object example) {
      this.example = Optional.of(example);
      return this;
    }
    @Override
    Schema.Builder example(Optional<Object> example) {
      if (example == null) {
        throw new NullPointerException("Null example");
      }
      this.example = example;
      return this;
    }
    @Override
    public Schema.Builder format(String format) {
      this.format = Optional.of(format);
      return this;
    }
    @Override
    Schema.Builder format(Optional<String> format) {
      if (format == null) {
        throw new NullPointerException("Null format");
      }
      this.format = format;
      return this;
    }
    @Override
    public Schema.Builder items(Schema items) {
      this.items = Optional.of(items);
      return this;
    }
    @Override
    Schema.Builder items(Optional<Schema> items) {
      if (items == null) {
        throw new NullPointerException("Null items");
      }
      this.items = items;
      return this;
    }
    @Override
    public Schema.Builder maxItems(Long maxItems) {
      this.maxItems = Optional.of(maxItems);
      return this;
    }
    @Override
    Schema.Builder maxItems(Optional<Long> maxItems) {
      if (maxItems == null) {
        throw new NullPointerException("Null maxItems");
      }
      this.maxItems = maxItems;
      return this;
    }
    @Override
    public Schema.Builder maxLength(Long maxLength) {
      this.maxLength = Optional.of(maxLength);
      return this;
    }
    @Override
    Schema.Builder maxLength(Optional<Long> maxLength) {
      if (maxLength == null) {
        throw new NullPointerException("Null maxLength");
      }
      this.maxLength = maxLength;
      return this;
    }
    @Override
    public Schema.Builder maxProperties(Long maxProperties) {
      this.maxProperties = Optional.of(maxProperties);
      return this;
    }
    @Override
    Schema.Builder maxProperties(Optional<Long> maxProperties) {
      if (maxProperties == null) {
        throw new NullPointerException("Null maxProperties");
      }
      this.maxProperties = maxProperties;
      return this;
    }
    @Override
    public Schema.Builder maximum(Double maximum) {
      this.maximum = Optional.of(maximum);
      return this;
    }
    @Override
    Schema.Builder maximum(Optional<Double> maximum) {
      if (maximum == null) {
        throw new NullPointerException("Null maximum");
      }
      this.maximum = maximum;
      return this;
    }
    @Override
    public Schema.Builder minItems(Long minItems) {
      this.minItems = Optional.of(minItems);
      return this;
    }
    @Override
    Schema.Builder minItems(Optional<Long> minItems) {
      if (minItems == null) {
        throw new NullPointerException("Null minItems");
      }
      this.minItems = minItems;
      return this;
    }
    @Override
    public Schema.Builder minLength(Long minLength) {
      this.minLength = Optional.of(minLength);
      return this;
    }
    @Override
    Schema.Builder minLength(Optional<Long> minLength) {
      if (minLength == null) {
        throw new NullPointerException("Null minLength");
      }
      this.minLength = minLength;
      return this;
    }
    @Override
    public Schema.Builder minProperties(Long minProperties) {
      this.minProperties = Optional.of(minProperties);
      return this;
    }
    @Override
    Schema.Builder minProperties(Optional<Long> minProperties) {
      if (minProperties == null) {
        throw new NullPointerException("Null minProperties");
      }
      this.minProperties = minProperties;
      return this;
    }
    @Override
    public Schema.Builder minimum(Double minimum) {
      this.minimum = Optional.of(minimum);
      return this;
    }
    @Override
    Schema.Builder minimum(Optional<Double> minimum) {
      if (minimum == null) {
        throw new NullPointerException("Null minimum");
      }
      this.minimum = minimum;
      return this;
    }
    @Override
    public Schema.Builder nullable(boolean nullable) {
      this.nullable = Optional.of(nullable);
      return this;
    }
    @Override
    Schema.Builder nullable(Optional<Boolean> nullable) {
      if (nullable == null) {
        throw new NullPointerException("Null nullable");
      }
      this.nullable = nullable;
      return this;
    }
    @Override
    public Schema.Builder pattern(String pattern) {
      this.pattern = Optional.of(pattern);
      return this;
    }
    @Override
    Schema.Builder pattern(Optional<String> pattern) {
      if (pattern == null) {
        throw new NullPointerException("Null pattern");
      }
      this.pattern = pattern;
      return this;
    }
    @Override
    public Schema.Builder properties(Map<String, Schema> properties) {
      this.properties = Optional.of(properties);
      return this;
    }
    @Override
    Schema.Builder properties(Optional<Map<String, Schema>> properties) {
      if (properties == null) {
        throw new NullPointerException("Null properties");
      }
      this.properties = properties;
      return this;
    }
    @Override
    public Schema.Builder propertyOrdering(List<String> propertyOrdering) {
      this.propertyOrdering = Optional.of(propertyOrdering);
      return this;
    }
    @Override
    Schema.Builder propertyOrdering(Optional<List<String>> propertyOrdering) {
      if (propertyOrdering == null) {
        throw new NullPointerException("Null propertyOrdering");
      }
      this.propertyOrdering = propertyOrdering;
      return this;
    }
    @Override
    public Schema.Builder required(List<String> required) {
      this.required = Optional.of(required);
      return this;
    }
    @Override
    Schema.Builder required(Optional<List<String>> required) {
      if (required == null) {
        throw new NullPointerException("Null required");
      }
      this.required = required;
      return this;
    }
    @Override
    public Schema.Builder title(String title) {
      this.title = Optional.of(title);
      return this;
    }
    @Override
    Schema.Builder title(Optional<String> title) {
      if (title == null) {
        throw new NullPointerException("Null title");
      }
      this.title = title;
      return this;
    }
    @Override
    public Schema.Builder type(Type type) {
      this.type = Optional.of(type);
      return this;
    }
    @Override
    Schema.Builder type(Optional<Type> type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    public Schema build() {
      return new AutoValue_Schema(
          this.anyOf,
          this.default_,
          this.description,
          this.enum_,
          this.example,
          this.format,
          this.items,
          this.maxItems,
          this.maxLength,
          this.maxProperties,
          this.maximum,
          this.minItems,
          this.minLength,
          this.minProperties,
          this.minimum,
          this.nullable,
          this.pattern,
          this.properties,
          this.propertyOrdering,
          this.required,
          this.title,
          this.type);
    }
  }

}
