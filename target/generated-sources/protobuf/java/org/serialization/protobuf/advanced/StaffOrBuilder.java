// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Staffbuf.proto

package org.serialization.protobuf.advanced;

public interface StaffOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Staff)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string email = 3;</code>
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 3;</code>
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <pre>
   *list
   * </pre>
   *
   * <code>repeated .Staff.PhoneNumber phones = 4;</code>
   */
  java.util.List<org.serialization.protobuf.advanced.Staff.PhoneNumber> 
      getPhonesList();
  /**
   * <pre>
   *list
   * </pre>
   *
   * <code>repeated .Staff.PhoneNumber phones = 4;</code>
   */
  org.serialization.protobuf.advanced.Staff.PhoneNumber getPhones(int index);
  /**
   * <pre>
   *list
   * </pre>
   *
   * <code>repeated .Staff.PhoneNumber phones = 4;</code>
   */
  int getPhonesCount();
  /**
   * <pre>
   *list
   * </pre>
   *
   * <code>repeated .Staff.PhoneNumber phones = 4;</code>
   */
  java.util.List<? extends org.serialization.protobuf.advanced.Staff.PhoneNumberOrBuilder> 
      getPhonesOrBuilderList();
  /**
   * <pre>
   *list
   * </pre>
   *
   * <code>repeated .Staff.PhoneNumber phones = 4;</code>
   */
  org.serialization.protobuf.advanced.Staff.PhoneNumberOrBuilder getPhonesOrBuilder(
      int index);

  /**
   * <code>.Staff.Map map = 5;</code>
   */
  boolean hasMap();
  /**
   * <code>.Staff.Map map = 5;</code>
   */
  org.serialization.protobuf.advanced.Staff.Map getMap();
  /**
   * <code>.Staff.Map map = 5;</code>
   */
  org.serialization.protobuf.advanced.Staff.MapOrBuilder getMapOrBuilder();
}