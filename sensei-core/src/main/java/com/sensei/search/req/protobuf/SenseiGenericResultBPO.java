// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensei-generic-res.proto

package com.sensei.search.req.protobuf;

public final class SenseiGenericResultBPO {
  private SenseiGenericResultBPO() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GenericResultOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string classname = 1;
    boolean hasClassname();
    String getClassname();
    
    // required bytes val = 2;
    boolean hasVal();
    com.google.protobuf.ByteString getVal();
  }
  public static final class GenericResult extends
      com.google.protobuf.GeneratedMessage
      implements GenericResultOrBuilder {
    // Use GenericResult.newBuilder() to construct.
    private GenericResult(Builder builder) {
      super(builder);
    }
    private GenericResult(boolean noInit) {}
    
    private static final GenericResult defaultInstance;
    public static GenericResult getDefaultInstance() {
      return defaultInstance;
    }
    
    public GenericResult getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sensei.search.req.protobuf.SenseiGenericResultBPO.internal_static_com_sensei_search_req_protobuf_GenericResult_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sensei.search.req.protobuf.SenseiGenericResultBPO.internal_static_com_sensei_search_req_protobuf_GenericResult_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string classname = 1;
    public static final int CLASSNAME_FIELD_NUMBER = 1;
    private Object classname_;
    public boolean hasClassname() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getClassname() {
      Object ref = classname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          classname_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getClassnameBytes() {
      Object ref = classname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        classname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required bytes val = 2;
    public static final int VAL_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString val_;
    public boolean hasVal() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public com.google.protobuf.ByteString getVal() {
      return val_;
    }
    
    private void initFields() {
      classname_ = "";
      val_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasClassname()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVal()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getClassnameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, val_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getClassnameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, val_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    @java.lang.Override
    protected Object writeReplace() throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.sensei.search.req.protobuf.SenseiGenericResultBPO.internal_static_com_sensei_search_req_protobuf_GenericResult_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.sensei.search.req.protobuf.SenseiGenericResultBPO.internal_static_com_sensei_search_req_protobuf_GenericResult_fieldAccessorTable;
      }
      
      // Construct using com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        classname_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        val_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult.getDescriptor();
      }
      
      public com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult getDefaultInstanceForType() {
        return com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult.getDefaultInstance();
      }
      
      public com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult build() {
        com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult buildPartial() {
        com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult result = new com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.classname_ = classname_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.val_ = val_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult) {
          return mergeFrom((com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult other) {
        if (other == com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult.getDefaultInstance()) return this;
        if (other.hasClassname()) {
          setClassname(other.getClassname());
        }
        if (other.hasVal()) {
          setVal(other.getVal());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasClassname()) {
          
          return false;
        }
        if (!hasVal()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              classname_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              val_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string classname = 1;
      private Object classname_ = "";
      public boolean hasClassname() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getClassname() {
        Object ref = classname_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          classname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setClassname(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        classname_ = value;
        onChanged();
        return this;
      }
      public Builder clearClassname() {
        bitField0_ = (bitField0_ & ~0x00000001);
        classname_ = getDefaultInstance().getClassname();
        onChanged();
        return this;
      }
      void setClassname(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        classname_ = value;
        onChanged();
      }
      
      // required bytes val = 2;
      private com.google.protobuf.ByteString val_ = com.google.protobuf.ByteString.EMPTY;
      public boolean hasVal() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public com.google.protobuf.ByteString getVal() {
        return val_;
      }
      public Builder setVal(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        val_ = value;
        onChanged();
        return this;
      }
      public Builder clearVal() {
        bitField0_ = (bitField0_ & ~0x00000002);
        val_ = getDefaultInstance().getVal();
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.sensei.search.req.protobuf.GenericResult)
    }
    
    static {
      defaultInstance = new GenericResult(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.sensei.search.req.protobuf.GenericResult)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sensei_search_req_protobuf_GenericResult_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_sensei_search_req_protobuf_GenericResult_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030sensei-generic-res.proto\022\036com.sensei.s" +
      "earch.req.protobuf\"/\n\rGenericResult\022\021\n\tc" +
      "lassname\030\001 \002(\t\022\013\n\003val\030\002 \002(\014B:\n\036com.sense" +
      "i.search.req.protobufB\026SenseiGenericResu" +
      "ltBPOH\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_sensei_search_req_protobuf_GenericResult_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_sensei_search_req_protobuf_GenericResult_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_sensei_search_req_protobuf_GenericResult_descriptor,
              new java.lang.String[] { "Classname", "Val", },
              com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult.class,
              com.sensei.search.req.protobuf.SenseiGenericResultBPO.GenericResult.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
