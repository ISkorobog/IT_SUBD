// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package org.example;

public final class Protobuf {
  private Protobuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_onlystring_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_onlystring_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_oneindex_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_oneindex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_twoindex_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_twoindex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_table_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_table_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_changevalue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_changevalue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_union_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_union_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_logical_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_logical_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016protobuf.proto\032\033google/protobuf/empty." +
      "proto\"\030\n\nonlystring\022\n\n\002ar\030\001 \001(\t\"\026\n\010onein" +
      "dex\022\n\n\002ar\030\001 \001(\005\"$\n\010twoindex\022\013\n\003ar1\030\001 \001(\005" +
      "\022\013\n\003ar2\030\002 \001(\005\"3\n\005table\022\014\n\004name\030\001 \001(\t\022\r\n\005" +
      "names\030\002 \003(\t\022\r\n\005types\030\003 \003(\t\"0\n\013changevalu" +
      "e\022\t\n\001i\030\001 \001(\005\022\t\n\001j\030\002 \001(\005\022\013\n\003val\030\003 \001(\t\"#\n\005" +
      "union\022\014\n\004name\030\001 \001(\t\022\014\n\004args\030\002 \003(\t\"\026\n\007log" +
      "ical\022\013\n\003ans\030\001 \001(\0102\356\n\n\017SUBDServiceGRPC\0229\n" +
      "\007OpenNew\022\026.google.protobuf.Empty\032\026.googl" +
      "e.protobuf.Empty\022\"\n\010OpenBase\022\013.onlystrin" +
      "g\032\t.oneindex\022.\n\nBaseOpened\022\026.google.prot" +
      "obuf.Empty\032\010.logical\022/\n\013TableOpened\022\026.go" +
      "ogle.protobuf.Empty\032\010.logical\0220\n\013RowsInT" +
      "able\022\026.google.protobuf.Empty\032\t.oneindex\022" +
      "3\n\016ColumnsInTable\022\026.google.protobuf.Empt" +
      "y\032\t.oneindex\022/\n\025GetNameInCurrentTable\022\t." +
      "oneindex\032\013.onlystring\022/\n\025GetTypeInCurren" +
      "tTable\022\t.oneindex\032\013.onlystring\022)\n\017GetVal" +
      "ueInTable\022\t.twoindex\032\013.onlystring\0226\n\021Get" +
      "NumberOfTables\022\026.google.protobuf.Empty\032\t" +
      ".oneindex\0220\n\030GetNumberOfFieldsInTable\022\t." +
      "oneindex\032\t.oneindex\022&\n\014GetTableName\022\t.on" +
      "eindex\032\013.onlystring\022:\n\023GetCurrentTableNa" +
      "me\022\026.google.protobuf.Empty\032\013.onlystring\022" +
      "(\n\016GetNameInTable\022\t.twoindex\032\013.onlystrin" +
      "g\022(\n\016GetTypeInTable\022\t.twoindex\032\013.onlystr" +
      "ing\022*\n\022ChangeCurrentTable\022\t.oneindex\032\t.o" +
      "neindex\022/\n\013BaseHasPath\022\026.google.protobuf" +
      ".Empty\032\010.logical\022+\n\007Changed\022\026.google.pro" +
      "tobuf.Empty\032\010.logical\022)\n\004Save\022\026.google.p" +
      "rotobuf.Empty\032\t.oneindex\0222\n\013getAllFiles\022" +
      "\026.google.protobuf.Empty\032\013.onlystring\022 \n\006" +
      "SaveAs\022\013.onlystring\032\t.oneindex\022 \n\013Create" +
      "Table\022\006.table\032\t.oneindex\022#\n\tOpenTable\022\013." +
      "onlystring\032\t.oneindex\022%\n\013DeleteTable\022\013.o" +
      "nlystring\032\t.oneindex\0228\n\006AddRow\022\026.google." +
      "protobuf.Empty\032\026.google.protobuf.Empty\022\"" +
      "\n\nDeleteRows\022\t.twoindex\032\t.oneindex\022)\n\016Ch" +
      "angeRowValue\022\014.changevalue\032\t.oneindex\022.\n" +
      "\007GetPath\022\026.google.protobuf.Empty\032\013.onlys" +
      "tring\022\032\n\005Union\022\006.union\032\t.oneindex\0227\n\005Clo" +
      "se\022\026.google.protobuf.Empty\032\026.google.prot" +
      "obuf.EmptyB$\n\013org.exampleP\001\252\002\022GrpcServic" +
      "e.Protosb\006proto3"
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
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_onlystring_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_onlystring_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_onlystring_descriptor,
        new java.lang.String[] { "Ar", });
    internal_static_oneindex_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_oneindex_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_oneindex_descriptor,
        new java.lang.String[] { "Ar", });
    internal_static_twoindex_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_twoindex_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_twoindex_descriptor,
        new java.lang.String[] { "Ar1", "Ar2", });
    internal_static_table_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_table_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_table_descriptor,
        new java.lang.String[] { "Name", "Names", "Types", });
    internal_static_changevalue_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_changevalue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_changevalue_descriptor,
        new java.lang.String[] { "I", "J", "Val", });
    internal_static_union_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_union_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_union_descriptor,
        new java.lang.String[] { "Name", "Args", });
    internal_static_logical_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_logical_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_logical_descriptor,
        new java.lang.String[] { "Ans", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
