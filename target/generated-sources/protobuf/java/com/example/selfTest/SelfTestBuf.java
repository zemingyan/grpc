// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blockfuture/selff.proto

package com.example.selfTest;

public final class SelfTestBuf {
  private SelfTestBuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SelfReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SelfReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SelfResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SelfResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SerialReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SerialReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027blockfuture/selff.proto\"@\n\007SelfReq\022\013\n\003" +
      "uid\030\001 \001(\005\022\023\n\004type\030\002 \001(\0162\005.Type\022\023\n\013phoneN" +
      "umber\030\003 \001(\t\"\032\n\010SelfResp\022\016\n\006result\030\001 \001(\t\"" +
      "\031\n\tSerialReq\022\014\n\004data\030\001 \001(\014*\035\n\004Type\022\t\n\005FI" +
      "RST\020\000\022\n\n\006SECOND\020\0012W\n\017SelfTestService\022#\n\014" +
      "firstService\022\010.SelfReq\032\t.SelfResp\022\037\n\006ser" +
      "ial\022\n.SerialReq\032\t.SelfRespB%\n\024com.exampl" +
      "e.selfTestB\013SelfTestBufP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_SelfReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SelfReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SelfReq_descriptor,
        new java.lang.String[] { "Uid", "Type", "PhoneNumber", });
    internal_static_SelfResp_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SelfResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SelfResp_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_SerialReq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SerialReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SerialReq_descriptor,
        new java.lang.String[] { "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
