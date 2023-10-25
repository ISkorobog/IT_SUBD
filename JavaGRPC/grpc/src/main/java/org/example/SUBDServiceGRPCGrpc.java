package org.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: protobuf.proto")
public final class SUBDServiceGRPCGrpc {

  private SUBDServiceGRPCGrpc() {}

  public static final String SERVICE_NAME = "SUBDServiceGRPC";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getOpenNewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenNew",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getOpenNewMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getOpenNewMethod;
    if ((getOpenNewMethod = SUBDServiceGRPCGrpc.getOpenNewMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getOpenNewMethod = SUBDServiceGRPCGrpc.getOpenNewMethod) == null) {
          SUBDServiceGRPCGrpc.getOpenNewMethod = getOpenNewMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "OpenNew"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("OpenNew"))
                  .build();
          }
        }
     }
     return getOpenNewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.onlystring,
      org.example.oneindex> getOpenBaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenBase",
      requestType = org.example.onlystring.class,
      responseType = org.example.oneindex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.onlystring,
      org.example.oneindex> getOpenBaseMethod() {
    io.grpc.MethodDescriptor<org.example.onlystring, org.example.oneindex> getOpenBaseMethod;
    if ((getOpenBaseMethod = SUBDServiceGRPCGrpc.getOpenBaseMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getOpenBaseMethod = SUBDServiceGRPCGrpc.getOpenBaseMethod) == null) {
          SUBDServiceGRPCGrpc.getOpenBaseMethod = getOpenBaseMethod = 
              io.grpc.MethodDescriptor.<org.example.onlystring, org.example.oneindex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "OpenBase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.onlystring.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.oneindex.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("OpenBase"))
                  .build();
          }
        }
     }
     return getOpenBaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.logical> getBaseOpenedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BaseOpened",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.logical.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.logical> getBaseOpenedMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.logical> getBaseOpenedMethod;
    if ((getBaseOpenedMethod = SUBDServiceGRPCGrpc.getBaseOpenedMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getBaseOpenedMethod = SUBDServiceGRPCGrpc.getBaseOpenedMethod) == null) {
          SUBDServiceGRPCGrpc.getBaseOpenedMethod = getBaseOpenedMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.logical>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "BaseOpened"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.logical.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("BaseOpened"))
                  .build();
          }
        }
     }
     return getBaseOpenedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.logical> getTableOpenedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TableOpened",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.logical.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.logical> getTableOpenedMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.logical> getTableOpenedMethod;
    if ((getTableOpenedMethod = SUBDServiceGRPCGrpc.getTableOpenedMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getTableOpenedMethod = SUBDServiceGRPCGrpc.getTableOpenedMethod) == null) {
          SUBDServiceGRPCGrpc.getTableOpenedMethod = getTableOpenedMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.logical>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "TableOpened"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.logical.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("TableOpened"))
                  .build();
          }
        }
     }
     return getTableOpenedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.oneindex> getRowsInTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RowsInTable",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.oneindex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.oneindex> getRowsInTableMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.oneindex> getRowsInTableMethod;
    if ((getRowsInTableMethod = SUBDServiceGRPCGrpc.getRowsInTableMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getRowsInTableMethod = SUBDServiceGRPCGrpc.getRowsInTableMethod) == null) {
          SUBDServiceGRPCGrpc.getRowsInTableMethod = getRowsInTableMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.oneindex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "RowsInTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.oneindex.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("RowsInTable"))
                  .build();
          }
        }
     }
     return getRowsInTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.oneindex> getColumnsInTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ColumnsInTable",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.oneindex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.oneindex> getColumnsInTableMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.oneindex> getColumnsInTableMethod;
    if ((getColumnsInTableMethod = SUBDServiceGRPCGrpc.getColumnsInTableMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getColumnsInTableMethod = SUBDServiceGRPCGrpc.getColumnsInTableMethod) == null) {
          SUBDServiceGRPCGrpc.getColumnsInTableMethod = getColumnsInTableMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.oneindex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "ColumnsInTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.oneindex.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("ColumnsInTable"))
                  .build();
          }
        }
     }
     return getColumnsInTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.oneindex,
      org.example.onlystring> getGetNameInCurrentTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNameInCurrentTable",
      requestType = org.example.oneindex.class,
      responseType = org.example.onlystring.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.oneindex,
      org.example.onlystring> getGetNameInCurrentTableMethod() {
    io.grpc.MethodDescriptor<org.example.oneindex, org.example.onlystring> getGetNameInCurrentTableMethod;
    if ((getGetNameInCurrentTableMethod = SUBDServiceGRPCGrpc.getGetNameInCurrentTableMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getGetNameInCurrentTableMethod = SUBDServiceGRPCGrpc.getGetNameInCurrentTableMethod) == null) {
          SUBDServiceGRPCGrpc.getGetNameInCurrentTableMethod = getGetNameInCurrentTableMethod = 
              io.grpc.MethodDescriptor.<org.example.oneindex, org.example.onlystring>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "GetNameInCurrentTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.oneindex.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.onlystring.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("GetNameInCurrentTable"))
                  .build();
          }
        }
     }
     return getGetNameInCurrentTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.oneindex,
      org.example.onlystring> getGetTypeInCurrentTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTypeInCurrentTable",
      requestType = org.example.oneindex.class,
      responseType = org.example.onlystring.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.oneindex,
      org.example.onlystring> getGetTypeInCurrentTableMethod() {
    io.grpc.MethodDescriptor<org.example.oneindex, org.example.onlystring> getGetTypeInCurrentTableMethod;
    if ((getGetTypeInCurrentTableMethod = SUBDServiceGRPCGrpc.getGetTypeInCurrentTableMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getGetTypeInCurrentTableMethod = SUBDServiceGRPCGrpc.getGetTypeInCurrentTableMethod) == null) {
          SUBDServiceGRPCGrpc.getGetTypeInCurrentTableMethod = getGetTypeInCurrentTableMethod = 
              io.grpc.MethodDescriptor.<org.example.oneindex, org.example.onlystring>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "GetTypeInCurrentTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.oneindex.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.onlystring.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("GetTypeInCurrentTable"))
                  .build();
          }
        }
     }
     return getGetTypeInCurrentTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.twoindex,
      org.example.onlystring> getGetValueInTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetValueInTable",
      requestType = org.example.twoindex.class,
      responseType = org.example.onlystring.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.twoindex,
      org.example.onlystring> getGetValueInTableMethod() {
    io.grpc.MethodDescriptor<org.example.twoindex, org.example.onlystring> getGetValueInTableMethod;
    if ((getGetValueInTableMethod = SUBDServiceGRPCGrpc.getGetValueInTableMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getGetValueInTableMethod = SUBDServiceGRPCGrpc.getGetValueInTableMethod) == null) {
          SUBDServiceGRPCGrpc.getGetValueInTableMethod = getGetValueInTableMethod = 
              io.grpc.MethodDescriptor.<org.example.twoindex, org.example.onlystring>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "GetValueInTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.twoindex.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.onlystring.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("GetValueInTable"))
                  .build();
          }
        }
     }
     return getGetValueInTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.oneindex> getGetNumberOfTablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNumberOfTables",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.oneindex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.oneindex> getGetNumberOfTablesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.oneindex> getGetNumberOfTablesMethod;
    if ((getGetNumberOfTablesMethod = SUBDServiceGRPCGrpc.getGetNumberOfTablesMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getGetNumberOfTablesMethod = SUBDServiceGRPCGrpc.getGetNumberOfTablesMethod) == null) {
          SUBDServiceGRPCGrpc.getGetNumberOfTablesMethod = getGetNumberOfTablesMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.oneindex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "GetNumberOfTables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.oneindex.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("GetNumberOfTables"))
                  .build();
          }
        }
     }
     return getGetNumberOfTablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.oneindex,
      org.example.oneindex> getGetNumberOfFieldsInTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNumberOfFieldsInTable",
      requestType = org.example.oneindex.class,
      responseType = org.example.oneindex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.oneindex,
      org.example.oneindex> getGetNumberOfFieldsInTableMethod() {
    io.grpc.MethodDescriptor<org.example.oneindex, org.example.oneindex> getGetNumberOfFieldsInTableMethod;
    if ((getGetNumberOfFieldsInTableMethod = SUBDServiceGRPCGrpc.getGetNumberOfFieldsInTableMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getGetNumberOfFieldsInTableMethod = SUBDServiceGRPCGrpc.getGetNumberOfFieldsInTableMethod) == null) {
          SUBDServiceGRPCGrpc.getGetNumberOfFieldsInTableMethod = getGetNumberOfFieldsInTableMethod = 
              io.grpc.MethodDescriptor.<org.example.oneindex, org.example.oneindex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "GetNumberOfFieldsInTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.oneindex.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.oneindex.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("GetNumberOfFieldsInTable"))
                  .build();
          }
        }
     }
     return getGetNumberOfFieldsInTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.oneindex,
      org.example.onlystring> getGetTableNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTableName",
      requestType = org.example.oneindex.class,
      responseType = org.example.onlystring.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.oneindex,
      org.example.onlystring> getGetTableNameMethod() {
    io.grpc.MethodDescriptor<org.example.oneindex, org.example.onlystring> getGetTableNameMethod;
    if ((getGetTableNameMethod = SUBDServiceGRPCGrpc.getGetTableNameMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getGetTableNameMethod = SUBDServiceGRPCGrpc.getGetTableNameMethod) == null) {
          SUBDServiceGRPCGrpc.getGetTableNameMethod = getGetTableNameMethod = 
              io.grpc.MethodDescriptor.<org.example.oneindex, org.example.onlystring>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "GetTableName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.oneindex.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.onlystring.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("GetTableName"))
                  .build();
          }
        }
     }
     return getGetTableNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.onlystring> getGetCurrentTableNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentTableName",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.onlystring.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.onlystring> getGetCurrentTableNameMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.onlystring> getGetCurrentTableNameMethod;
    if ((getGetCurrentTableNameMethod = SUBDServiceGRPCGrpc.getGetCurrentTableNameMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getGetCurrentTableNameMethod = SUBDServiceGRPCGrpc.getGetCurrentTableNameMethod) == null) {
          SUBDServiceGRPCGrpc.getGetCurrentTableNameMethod = getGetCurrentTableNameMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.onlystring>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "GetCurrentTableName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.onlystring.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("GetCurrentTableName"))
                  .build();
          }
        }
     }
     return getGetCurrentTableNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.twoindex,
      org.example.onlystring> getGetNameInTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNameInTable",
      requestType = org.example.twoindex.class,
      responseType = org.example.onlystring.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.twoindex,
      org.example.onlystring> getGetNameInTableMethod() {
    io.grpc.MethodDescriptor<org.example.twoindex, org.example.onlystring> getGetNameInTableMethod;
    if ((getGetNameInTableMethod = SUBDServiceGRPCGrpc.getGetNameInTableMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getGetNameInTableMethod = SUBDServiceGRPCGrpc.getGetNameInTableMethod) == null) {
          SUBDServiceGRPCGrpc.getGetNameInTableMethod = getGetNameInTableMethod = 
              io.grpc.MethodDescriptor.<org.example.twoindex, org.example.onlystring>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "GetNameInTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.twoindex.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.onlystring.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("GetNameInTable"))
                  .build();
          }
        }
     }
     return getGetNameInTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.twoindex,
      org.example.onlystring> getGetTypeInTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTypeInTable",
      requestType = org.example.twoindex.class,
      responseType = org.example.onlystring.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.twoindex,
      org.example.onlystring> getGetTypeInTableMethod() {
    io.grpc.MethodDescriptor<org.example.twoindex, org.example.onlystring> getGetTypeInTableMethod;
    if ((getGetTypeInTableMethod = SUBDServiceGRPCGrpc.getGetTypeInTableMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getGetTypeInTableMethod = SUBDServiceGRPCGrpc.getGetTypeInTableMethod) == null) {
          SUBDServiceGRPCGrpc.getGetTypeInTableMethod = getGetTypeInTableMethod = 
              io.grpc.MethodDescriptor.<org.example.twoindex, org.example.onlystring>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "GetTypeInTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.twoindex.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.onlystring.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("GetTypeInTable"))
                  .build();
          }
        }
     }
     return getGetTypeInTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.oneindex,
      org.example.oneindex> getChangeCurrentTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeCurrentTable",
      requestType = org.example.oneindex.class,
      responseType = org.example.oneindex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.oneindex,
      org.example.oneindex> getChangeCurrentTableMethod() {
    io.grpc.MethodDescriptor<org.example.oneindex, org.example.oneindex> getChangeCurrentTableMethod;
    if ((getChangeCurrentTableMethod = SUBDServiceGRPCGrpc.getChangeCurrentTableMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getChangeCurrentTableMethod = SUBDServiceGRPCGrpc.getChangeCurrentTableMethod) == null) {
          SUBDServiceGRPCGrpc.getChangeCurrentTableMethod = getChangeCurrentTableMethod = 
              io.grpc.MethodDescriptor.<org.example.oneindex, org.example.oneindex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "ChangeCurrentTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.oneindex.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.oneindex.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("ChangeCurrentTable"))
                  .build();
          }
        }
     }
     return getChangeCurrentTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.logical> getBaseHasPathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BaseHasPath",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.logical.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.logical> getBaseHasPathMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.logical> getBaseHasPathMethod;
    if ((getBaseHasPathMethod = SUBDServiceGRPCGrpc.getBaseHasPathMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getBaseHasPathMethod = SUBDServiceGRPCGrpc.getBaseHasPathMethod) == null) {
          SUBDServiceGRPCGrpc.getBaseHasPathMethod = getBaseHasPathMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.logical>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "BaseHasPath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.logical.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("BaseHasPath"))
                  .build();
          }
        }
     }
     return getBaseHasPathMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.logical> getChangedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Changed",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.logical.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.logical> getChangedMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.logical> getChangedMethod;
    if ((getChangedMethod = SUBDServiceGRPCGrpc.getChangedMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getChangedMethod = SUBDServiceGRPCGrpc.getChangedMethod) == null) {
          SUBDServiceGRPCGrpc.getChangedMethod = getChangedMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.logical>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "Changed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.logical.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("Changed"))
                  .build();
          }
        }
     }
     return getChangedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.oneindex> getSaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Save",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.oneindex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.oneindex> getSaveMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.oneindex> getSaveMethod;
    if ((getSaveMethod = SUBDServiceGRPCGrpc.getSaveMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getSaveMethod = SUBDServiceGRPCGrpc.getSaveMethod) == null) {
          SUBDServiceGRPCGrpc.getSaveMethod = getSaveMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.oneindex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "Save"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.oneindex.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("Save"))
                  .build();
          }
        }
     }
     return getSaveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.onlystring> getGetAllFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllFiles",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.onlystring.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.onlystring> getGetAllFilesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.onlystring> getGetAllFilesMethod;
    if ((getGetAllFilesMethod = SUBDServiceGRPCGrpc.getGetAllFilesMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getGetAllFilesMethod = SUBDServiceGRPCGrpc.getGetAllFilesMethod) == null) {
          SUBDServiceGRPCGrpc.getGetAllFilesMethod = getGetAllFilesMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.onlystring>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "getAllFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.onlystring.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("getAllFiles"))
                  .build();
          }
        }
     }
     return getGetAllFilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.onlystring,
      org.example.oneindex> getSaveAsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveAs",
      requestType = org.example.onlystring.class,
      responseType = org.example.oneindex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.onlystring,
      org.example.oneindex> getSaveAsMethod() {
    io.grpc.MethodDescriptor<org.example.onlystring, org.example.oneindex> getSaveAsMethod;
    if ((getSaveAsMethod = SUBDServiceGRPCGrpc.getSaveAsMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getSaveAsMethod = SUBDServiceGRPCGrpc.getSaveAsMethod) == null) {
          SUBDServiceGRPCGrpc.getSaveAsMethod = getSaveAsMethod = 
              io.grpc.MethodDescriptor.<org.example.onlystring, org.example.oneindex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "SaveAs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.onlystring.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.oneindex.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("SaveAs"))
                  .build();
          }
        }
     }
     return getSaveAsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.table,
      org.example.oneindex> getCreateTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTable",
      requestType = org.example.table.class,
      responseType = org.example.oneindex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.table,
      org.example.oneindex> getCreateTableMethod() {
    io.grpc.MethodDescriptor<org.example.table, org.example.oneindex> getCreateTableMethod;
    if ((getCreateTableMethod = SUBDServiceGRPCGrpc.getCreateTableMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getCreateTableMethod = SUBDServiceGRPCGrpc.getCreateTableMethod) == null) {
          SUBDServiceGRPCGrpc.getCreateTableMethod = getCreateTableMethod = 
              io.grpc.MethodDescriptor.<org.example.table, org.example.oneindex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "CreateTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.table.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.oneindex.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("CreateTable"))
                  .build();
          }
        }
     }
     return getCreateTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.onlystring,
      org.example.oneindex> getOpenTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenTable",
      requestType = org.example.onlystring.class,
      responseType = org.example.oneindex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.onlystring,
      org.example.oneindex> getOpenTableMethod() {
    io.grpc.MethodDescriptor<org.example.onlystring, org.example.oneindex> getOpenTableMethod;
    if ((getOpenTableMethod = SUBDServiceGRPCGrpc.getOpenTableMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getOpenTableMethod = SUBDServiceGRPCGrpc.getOpenTableMethod) == null) {
          SUBDServiceGRPCGrpc.getOpenTableMethod = getOpenTableMethod = 
              io.grpc.MethodDescriptor.<org.example.onlystring, org.example.oneindex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "OpenTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.onlystring.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.oneindex.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("OpenTable"))
                  .build();
          }
        }
     }
     return getOpenTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.onlystring,
      org.example.oneindex> getDeleteTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTable",
      requestType = org.example.onlystring.class,
      responseType = org.example.oneindex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.onlystring,
      org.example.oneindex> getDeleteTableMethod() {
    io.grpc.MethodDescriptor<org.example.onlystring, org.example.oneindex> getDeleteTableMethod;
    if ((getDeleteTableMethod = SUBDServiceGRPCGrpc.getDeleteTableMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getDeleteTableMethod = SUBDServiceGRPCGrpc.getDeleteTableMethod) == null) {
          SUBDServiceGRPCGrpc.getDeleteTableMethod = getDeleteTableMethod = 
              io.grpc.MethodDescriptor.<org.example.onlystring, org.example.oneindex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "DeleteTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.onlystring.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.oneindex.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("DeleteTable"))
                  .build();
          }
        }
     }
     return getDeleteTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getAddRowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRow",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getAddRowMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getAddRowMethod;
    if ((getAddRowMethod = SUBDServiceGRPCGrpc.getAddRowMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getAddRowMethod = SUBDServiceGRPCGrpc.getAddRowMethod) == null) {
          SUBDServiceGRPCGrpc.getAddRowMethod = getAddRowMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "AddRow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("AddRow"))
                  .build();
          }
        }
     }
     return getAddRowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.twoindex,
      org.example.oneindex> getDeleteRowsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRows",
      requestType = org.example.twoindex.class,
      responseType = org.example.oneindex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.twoindex,
      org.example.oneindex> getDeleteRowsMethod() {
    io.grpc.MethodDescriptor<org.example.twoindex, org.example.oneindex> getDeleteRowsMethod;
    if ((getDeleteRowsMethod = SUBDServiceGRPCGrpc.getDeleteRowsMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getDeleteRowsMethod = SUBDServiceGRPCGrpc.getDeleteRowsMethod) == null) {
          SUBDServiceGRPCGrpc.getDeleteRowsMethod = getDeleteRowsMethod = 
              io.grpc.MethodDescriptor.<org.example.twoindex, org.example.oneindex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "DeleteRows"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.twoindex.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.oneindex.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("DeleteRows"))
                  .build();
          }
        }
     }
     return getDeleteRowsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.changevalue,
      org.example.oneindex> getChangeRowValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeRowValue",
      requestType = org.example.changevalue.class,
      responseType = org.example.oneindex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.changevalue,
      org.example.oneindex> getChangeRowValueMethod() {
    io.grpc.MethodDescriptor<org.example.changevalue, org.example.oneindex> getChangeRowValueMethod;
    if ((getChangeRowValueMethod = SUBDServiceGRPCGrpc.getChangeRowValueMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getChangeRowValueMethod = SUBDServiceGRPCGrpc.getChangeRowValueMethod) == null) {
          SUBDServiceGRPCGrpc.getChangeRowValueMethod = getChangeRowValueMethod = 
              io.grpc.MethodDescriptor.<org.example.changevalue, org.example.oneindex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "ChangeRowValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.changevalue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.oneindex.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("ChangeRowValue"))
                  .build();
          }
        }
     }
     return getChangeRowValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.onlystring> getGetPathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPath",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.onlystring.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.onlystring> getGetPathMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.onlystring> getGetPathMethod;
    if ((getGetPathMethod = SUBDServiceGRPCGrpc.getGetPathMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getGetPathMethod = SUBDServiceGRPCGrpc.getGetPathMethod) == null) {
          SUBDServiceGRPCGrpc.getGetPathMethod = getGetPathMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.onlystring>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "GetPath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.onlystring.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("GetPath"))
                  .build();
          }
        }
     }
     return getGetPathMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.union,
      org.example.oneindex> getUnionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Union",
      requestType = org.example.union.class,
      responseType = org.example.oneindex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.union,
      org.example.oneindex> getUnionMethod() {
    io.grpc.MethodDescriptor<org.example.union, org.example.oneindex> getUnionMethod;
    if ((getUnionMethod = SUBDServiceGRPCGrpc.getUnionMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getUnionMethod = SUBDServiceGRPCGrpc.getUnionMethod) == null) {
          SUBDServiceGRPCGrpc.getUnionMethod = getUnionMethod = 
              io.grpc.MethodDescriptor.<org.example.union, org.example.oneindex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "Union"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.union.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.oneindex.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("Union"))
                  .build();
          }
        }
     }
     return getUnionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getCloseMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getCloseMethod;
    if ((getCloseMethod = SUBDServiceGRPCGrpc.getCloseMethod) == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        if ((getCloseMethod = SUBDServiceGRPCGrpc.getCloseMethod) == null) {
          SUBDServiceGRPCGrpc.getCloseMethod = getCloseMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SUBDServiceGRPC", "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new SUBDServiceGRPCMethodDescriptorSupplier("Close"))
                  .build();
          }
        }
     }
     return getCloseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SUBDServiceGRPCStub newStub(io.grpc.Channel channel) {
    return new SUBDServiceGRPCStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SUBDServiceGRPCBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SUBDServiceGRPCBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SUBDServiceGRPCFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SUBDServiceGRPCFutureStub(channel);
  }

  /**
   */
  public static abstract class SUBDServiceGRPCImplBase implements io.grpc.BindableService {

    /**
     */
    public void openNew(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getOpenNewMethod(), responseObserver);
    }

    /**
     */
    public void openBase(org.example.onlystring request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnimplementedUnaryCall(getOpenBaseMethod(), responseObserver);
    }

    /**
     */
    public void baseOpened(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.logical> responseObserver) {
      asyncUnimplementedUnaryCall(getBaseOpenedMethod(), responseObserver);
    }

    /**
     */
    public void tableOpened(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.logical> responseObserver) {
      asyncUnimplementedUnaryCall(getTableOpenedMethod(), responseObserver);
    }

    /**
     */
    public void rowsInTable(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnimplementedUnaryCall(getRowsInTableMethod(), responseObserver);
    }

    /**
     */
    public void columnsInTable(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnimplementedUnaryCall(getColumnsInTableMethod(), responseObserver);
    }

    /**
     */
    public void getNameInCurrentTable(org.example.oneindex request,
        io.grpc.stub.StreamObserver<org.example.onlystring> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNameInCurrentTableMethod(), responseObserver);
    }

    /**
     */
    public void getTypeInCurrentTable(org.example.oneindex request,
        io.grpc.stub.StreamObserver<org.example.onlystring> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTypeInCurrentTableMethod(), responseObserver);
    }

    /**
     */
    public void getValueInTable(org.example.twoindex request,
        io.grpc.stub.StreamObserver<org.example.onlystring> responseObserver) {
      asyncUnimplementedUnaryCall(getGetValueInTableMethod(), responseObserver);
    }

    /**
     */
    public void getNumberOfTables(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNumberOfTablesMethod(), responseObserver);
    }

    /**
     */
    public void getNumberOfFieldsInTable(org.example.oneindex request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNumberOfFieldsInTableMethod(), responseObserver);
    }

    /**
     */
    public void getTableName(org.example.oneindex request,
        io.grpc.stub.StreamObserver<org.example.onlystring> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTableNameMethod(), responseObserver);
    }

    /**
     */
    public void getCurrentTableName(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.onlystring> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrentTableNameMethod(), responseObserver);
    }

    /**
     */
    public void getNameInTable(org.example.twoindex request,
        io.grpc.stub.StreamObserver<org.example.onlystring> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNameInTableMethod(), responseObserver);
    }

    /**
     */
    public void getTypeInTable(org.example.twoindex request,
        io.grpc.stub.StreamObserver<org.example.onlystring> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTypeInTableMethod(), responseObserver);
    }

    /**
     */
    public void changeCurrentTable(org.example.oneindex request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeCurrentTableMethod(), responseObserver);
    }

    /**
     */
    public void baseHasPath(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.logical> responseObserver) {
      asyncUnimplementedUnaryCall(getBaseHasPathMethod(), responseObserver);
    }

    /**
     */
    public void changed(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.logical> responseObserver) {
      asyncUnimplementedUnaryCall(getChangedMethod(), responseObserver);
    }

    /**
     */
    public void save(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveMethod(), responseObserver);
    }

    /**
     */
    public void getAllFiles(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.onlystring> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllFilesMethod(), responseObserver);
    }

    /**
     */
    public void saveAs(org.example.onlystring request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveAsMethod(), responseObserver);
    }

    /**
     */
    public void createTable(org.example.table request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTableMethod(), responseObserver);
    }

    /**
     */
    public void openTable(org.example.onlystring request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnimplementedUnaryCall(getOpenTableMethod(), responseObserver);
    }

    /**
     */
    public void deleteTable(org.example.onlystring request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTableMethod(), responseObserver);
    }

    /**
     */
    public void addRow(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRowMethod(), responseObserver);
    }

    /**
     */
    public void deleteRows(org.example.twoindex request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteRowsMethod(), responseObserver);
    }

    /**
     */
    public void changeRowValue(org.example.changevalue request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeRowValueMethod(), responseObserver);
    }

    /**
     */
    public void getPath(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.onlystring> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPathMethod(), responseObserver);
    }

    /**
     */
    public void union(org.example.union request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnimplementedUnaryCall(getUnionMethod(), responseObserver);
    }

    /**
     */
    public void close(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenNewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.google.protobuf.Empty>(
                  this, METHODID_OPEN_NEW)))
          .addMethod(
            getOpenBaseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.onlystring,
                org.example.oneindex>(
                  this, METHODID_OPEN_BASE)))
          .addMethod(
            getBaseOpenedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.logical>(
                  this, METHODID_BASE_OPENED)))
          .addMethod(
            getTableOpenedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.logical>(
                  this, METHODID_TABLE_OPENED)))
          .addMethod(
            getRowsInTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.oneindex>(
                  this, METHODID_ROWS_IN_TABLE)))
          .addMethod(
            getColumnsInTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.oneindex>(
                  this, METHODID_COLUMNS_IN_TABLE)))
          .addMethod(
            getGetNameInCurrentTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.oneindex,
                org.example.onlystring>(
                  this, METHODID_GET_NAME_IN_CURRENT_TABLE)))
          .addMethod(
            getGetTypeInCurrentTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.oneindex,
                org.example.onlystring>(
                  this, METHODID_GET_TYPE_IN_CURRENT_TABLE)))
          .addMethod(
            getGetValueInTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.twoindex,
                org.example.onlystring>(
                  this, METHODID_GET_VALUE_IN_TABLE)))
          .addMethod(
            getGetNumberOfTablesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.oneindex>(
                  this, METHODID_GET_NUMBER_OF_TABLES)))
          .addMethod(
            getGetNumberOfFieldsInTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.oneindex,
                org.example.oneindex>(
                  this, METHODID_GET_NUMBER_OF_FIELDS_IN_TABLE)))
          .addMethod(
            getGetTableNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.oneindex,
                org.example.onlystring>(
                  this, METHODID_GET_TABLE_NAME)))
          .addMethod(
            getGetCurrentTableNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.onlystring>(
                  this, METHODID_GET_CURRENT_TABLE_NAME)))
          .addMethod(
            getGetNameInTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.twoindex,
                org.example.onlystring>(
                  this, METHODID_GET_NAME_IN_TABLE)))
          .addMethod(
            getGetTypeInTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.twoindex,
                org.example.onlystring>(
                  this, METHODID_GET_TYPE_IN_TABLE)))
          .addMethod(
            getChangeCurrentTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.oneindex,
                org.example.oneindex>(
                  this, METHODID_CHANGE_CURRENT_TABLE)))
          .addMethod(
            getBaseHasPathMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.logical>(
                  this, METHODID_BASE_HAS_PATH)))
          .addMethod(
            getChangedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.logical>(
                  this, METHODID_CHANGED)))
          .addMethod(
            getSaveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.oneindex>(
                  this, METHODID_SAVE)))
          .addMethod(
            getGetAllFilesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.onlystring>(
                  this, METHODID_GET_ALL_FILES)))
          .addMethod(
            getSaveAsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.onlystring,
                org.example.oneindex>(
                  this, METHODID_SAVE_AS)))
          .addMethod(
            getCreateTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.table,
                org.example.oneindex>(
                  this, METHODID_CREATE_TABLE)))
          .addMethod(
            getOpenTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.onlystring,
                org.example.oneindex>(
                  this, METHODID_OPEN_TABLE)))
          .addMethod(
            getDeleteTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.onlystring,
                org.example.oneindex>(
                  this, METHODID_DELETE_TABLE)))
          .addMethod(
            getAddRowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_ROW)))
          .addMethod(
            getDeleteRowsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.twoindex,
                org.example.oneindex>(
                  this, METHODID_DELETE_ROWS)))
          .addMethod(
            getChangeRowValueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.changevalue,
                org.example.oneindex>(
                  this, METHODID_CHANGE_ROW_VALUE)))
          .addMethod(
            getGetPathMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.onlystring>(
                  this, METHODID_GET_PATH)))
          .addMethod(
            getUnionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.union,
                org.example.oneindex>(
                  this, METHODID_UNION)))
          .addMethod(
            getCloseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.google.protobuf.Empty>(
                  this, METHODID_CLOSE)))
          .build();
    }
  }

  /**
   */
  public static final class SUBDServiceGRPCStub extends io.grpc.stub.AbstractStub<SUBDServiceGRPCStub> {
    private SUBDServiceGRPCStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SUBDServiceGRPCStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SUBDServiceGRPCStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SUBDServiceGRPCStub(channel, callOptions);
    }

    /**
     */
    public void openNew(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOpenNewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void openBase(org.example.onlystring request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOpenBaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void baseOpened(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.logical> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBaseOpenedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tableOpened(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.logical> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTableOpenedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rowsInTable(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRowsInTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void columnsInTable(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getColumnsInTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNameInCurrentTable(org.example.oneindex request,
        io.grpc.stub.StreamObserver<org.example.onlystring> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNameInCurrentTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTypeInCurrentTable(org.example.oneindex request,
        io.grpc.stub.StreamObserver<org.example.onlystring> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTypeInCurrentTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getValueInTable(org.example.twoindex request,
        io.grpc.stub.StreamObserver<org.example.onlystring> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetValueInTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNumberOfTables(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNumberOfTablesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNumberOfFieldsInTable(org.example.oneindex request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNumberOfFieldsInTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTableName(org.example.oneindex request,
        io.grpc.stub.StreamObserver<org.example.onlystring> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTableNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCurrentTableName(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.onlystring> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCurrentTableNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNameInTable(org.example.twoindex request,
        io.grpc.stub.StreamObserver<org.example.onlystring> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNameInTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTypeInTable(org.example.twoindex request,
        io.grpc.stub.StreamObserver<org.example.onlystring> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTypeInTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeCurrentTable(org.example.oneindex request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeCurrentTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void baseHasPath(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.logical> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBaseHasPathMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changed(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.logical> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void save(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllFiles(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.onlystring> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllFilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveAs(org.example.onlystring request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveAsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTable(org.example.table request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void openTable(org.example.onlystring request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOpenTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTable(org.example.onlystring request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRow(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRows(org.example.twoindex request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteRowsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeRowValue(org.example.changevalue request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeRowValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPath(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.onlystring> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPathMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void union(org.example.union request,
        io.grpc.stub.StreamObserver<org.example.oneindex> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void close(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SUBDServiceGRPCBlockingStub extends io.grpc.stub.AbstractStub<SUBDServiceGRPCBlockingStub> {
    private SUBDServiceGRPCBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SUBDServiceGRPCBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SUBDServiceGRPCBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SUBDServiceGRPCBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty openNew(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getOpenNewMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.oneindex openBase(org.example.onlystring request) {
      return blockingUnaryCall(
          getChannel(), getOpenBaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.logical baseOpened(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getBaseOpenedMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.logical tableOpened(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getTableOpenedMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.oneindex rowsInTable(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getRowsInTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.oneindex columnsInTable(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getColumnsInTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.onlystring getNameInCurrentTable(org.example.oneindex request) {
      return blockingUnaryCall(
          getChannel(), getGetNameInCurrentTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.onlystring getTypeInCurrentTable(org.example.oneindex request) {
      return blockingUnaryCall(
          getChannel(), getGetTypeInCurrentTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.onlystring getValueInTable(org.example.twoindex request) {
      return blockingUnaryCall(
          getChannel(), getGetValueInTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.oneindex getNumberOfTables(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetNumberOfTablesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.oneindex getNumberOfFieldsInTable(org.example.oneindex request) {
      return blockingUnaryCall(
          getChannel(), getGetNumberOfFieldsInTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.onlystring getTableName(org.example.oneindex request) {
      return blockingUnaryCall(
          getChannel(), getGetTableNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.onlystring getCurrentTableName(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetCurrentTableNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.onlystring getNameInTable(org.example.twoindex request) {
      return blockingUnaryCall(
          getChannel(), getGetNameInTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.onlystring getTypeInTable(org.example.twoindex request) {
      return blockingUnaryCall(
          getChannel(), getGetTypeInTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.oneindex changeCurrentTable(org.example.oneindex request) {
      return blockingUnaryCall(
          getChannel(), getChangeCurrentTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.logical baseHasPath(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getBaseHasPathMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.logical changed(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getChangedMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.oneindex save(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSaveMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.onlystring getAllFiles(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllFilesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.oneindex saveAs(org.example.onlystring request) {
      return blockingUnaryCall(
          getChannel(), getSaveAsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.oneindex createTable(org.example.table request) {
      return blockingUnaryCall(
          getChannel(), getCreateTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.oneindex openTable(org.example.onlystring request) {
      return blockingUnaryCall(
          getChannel(), getOpenTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.oneindex deleteTable(org.example.onlystring request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty addRow(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getAddRowMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.oneindex deleteRows(org.example.twoindex request) {
      return blockingUnaryCall(
          getChannel(), getDeleteRowsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.oneindex changeRowValue(org.example.changevalue request) {
      return blockingUnaryCall(
          getChannel(), getChangeRowValueMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.onlystring getPath(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetPathMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.oneindex union(org.example.union request) {
      return blockingUnaryCall(
          getChannel(), getUnionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty close(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SUBDServiceGRPCFutureStub extends io.grpc.stub.AbstractStub<SUBDServiceGRPCFutureStub> {
    private SUBDServiceGRPCFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SUBDServiceGRPCFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SUBDServiceGRPCFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SUBDServiceGRPCFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> openNew(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getOpenNewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.oneindex> openBase(
        org.example.onlystring request) {
      return futureUnaryCall(
          getChannel().newCall(getOpenBaseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.logical> baseOpened(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getBaseOpenedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.logical> tableOpened(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getTableOpenedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.oneindex> rowsInTable(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getRowsInTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.oneindex> columnsInTable(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getColumnsInTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.onlystring> getNameInCurrentTable(
        org.example.oneindex request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNameInCurrentTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.onlystring> getTypeInCurrentTable(
        org.example.oneindex request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTypeInCurrentTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.onlystring> getValueInTable(
        org.example.twoindex request) {
      return futureUnaryCall(
          getChannel().newCall(getGetValueInTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.oneindex> getNumberOfTables(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNumberOfTablesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.oneindex> getNumberOfFieldsInTable(
        org.example.oneindex request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNumberOfFieldsInTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.onlystring> getTableName(
        org.example.oneindex request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTableNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.onlystring> getCurrentTableName(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCurrentTableNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.onlystring> getNameInTable(
        org.example.twoindex request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNameInTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.onlystring> getTypeInTable(
        org.example.twoindex request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTypeInTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.oneindex> changeCurrentTable(
        org.example.oneindex request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeCurrentTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.logical> baseHasPath(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getBaseHasPathMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.logical> changed(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getChangedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.oneindex> save(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.onlystring> getAllFiles(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllFilesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.oneindex> saveAs(
        org.example.onlystring request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveAsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.oneindex> createTable(
        org.example.table request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.oneindex> openTable(
        org.example.onlystring request) {
      return futureUnaryCall(
          getChannel().newCall(getOpenTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.oneindex> deleteTable(
        org.example.onlystring request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addRow(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.oneindex> deleteRows(
        org.example.twoindex request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteRowsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.oneindex> changeRowValue(
        org.example.changevalue request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeRowValueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.onlystring> getPath(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPathMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.oneindex> union(
        org.example.union request) {
      return futureUnaryCall(
          getChannel().newCall(getUnionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> close(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OPEN_NEW = 0;
  private static final int METHODID_OPEN_BASE = 1;
  private static final int METHODID_BASE_OPENED = 2;
  private static final int METHODID_TABLE_OPENED = 3;
  private static final int METHODID_ROWS_IN_TABLE = 4;
  private static final int METHODID_COLUMNS_IN_TABLE = 5;
  private static final int METHODID_GET_NAME_IN_CURRENT_TABLE = 6;
  private static final int METHODID_GET_TYPE_IN_CURRENT_TABLE = 7;
  private static final int METHODID_GET_VALUE_IN_TABLE = 8;
  private static final int METHODID_GET_NUMBER_OF_TABLES = 9;
  private static final int METHODID_GET_NUMBER_OF_FIELDS_IN_TABLE = 10;
  private static final int METHODID_GET_TABLE_NAME = 11;
  private static final int METHODID_GET_CURRENT_TABLE_NAME = 12;
  private static final int METHODID_GET_NAME_IN_TABLE = 13;
  private static final int METHODID_GET_TYPE_IN_TABLE = 14;
  private static final int METHODID_CHANGE_CURRENT_TABLE = 15;
  private static final int METHODID_BASE_HAS_PATH = 16;
  private static final int METHODID_CHANGED = 17;
  private static final int METHODID_SAVE = 18;
  private static final int METHODID_GET_ALL_FILES = 19;
  private static final int METHODID_SAVE_AS = 20;
  private static final int METHODID_CREATE_TABLE = 21;
  private static final int METHODID_OPEN_TABLE = 22;
  private static final int METHODID_DELETE_TABLE = 23;
  private static final int METHODID_ADD_ROW = 24;
  private static final int METHODID_DELETE_ROWS = 25;
  private static final int METHODID_CHANGE_ROW_VALUE = 26;
  private static final int METHODID_GET_PATH = 27;
  private static final int METHODID_UNION = 28;
  private static final int METHODID_CLOSE = 29;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SUBDServiceGRPCImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SUBDServiceGRPCImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN_NEW:
          serviceImpl.openNew((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_OPEN_BASE:
          serviceImpl.openBase((org.example.onlystring) request,
              (io.grpc.stub.StreamObserver<org.example.oneindex>) responseObserver);
          break;
        case METHODID_BASE_OPENED:
          serviceImpl.baseOpened((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.logical>) responseObserver);
          break;
        case METHODID_TABLE_OPENED:
          serviceImpl.tableOpened((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.logical>) responseObserver);
          break;
        case METHODID_ROWS_IN_TABLE:
          serviceImpl.rowsInTable((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.oneindex>) responseObserver);
          break;
        case METHODID_COLUMNS_IN_TABLE:
          serviceImpl.columnsInTable((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.oneindex>) responseObserver);
          break;
        case METHODID_GET_NAME_IN_CURRENT_TABLE:
          serviceImpl.getNameInCurrentTable((org.example.oneindex) request,
              (io.grpc.stub.StreamObserver<org.example.onlystring>) responseObserver);
          break;
        case METHODID_GET_TYPE_IN_CURRENT_TABLE:
          serviceImpl.getTypeInCurrentTable((org.example.oneindex) request,
              (io.grpc.stub.StreamObserver<org.example.onlystring>) responseObserver);
          break;
        case METHODID_GET_VALUE_IN_TABLE:
          serviceImpl.getValueInTable((org.example.twoindex) request,
              (io.grpc.stub.StreamObserver<org.example.onlystring>) responseObserver);
          break;
        case METHODID_GET_NUMBER_OF_TABLES:
          serviceImpl.getNumberOfTables((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.oneindex>) responseObserver);
          break;
        case METHODID_GET_NUMBER_OF_FIELDS_IN_TABLE:
          serviceImpl.getNumberOfFieldsInTable((org.example.oneindex) request,
              (io.grpc.stub.StreamObserver<org.example.oneindex>) responseObserver);
          break;
        case METHODID_GET_TABLE_NAME:
          serviceImpl.getTableName((org.example.oneindex) request,
              (io.grpc.stub.StreamObserver<org.example.onlystring>) responseObserver);
          break;
        case METHODID_GET_CURRENT_TABLE_NAME:
          serviceImpl.getCurrentTableName((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.onlystring>) responseObserver);
          break;
        case METHODID_GET_NAME_IN_TABLE:
          serviceImpl.getNameInTable((org.example.twoindex) request,
              (io.grpc.stub.StreamObserver<org.example.onlystring>) responseObserver);
          break;
        case METHODID_GET_TYPE_IN_TABLE:
          serviceImpl.getTypeInTable((org.example.twoindex) request,
              (io.grpc.stub.StreamObserver<org.example.onlystring>) responseObserver);
          break;
        case METHODID_CHANGE_CURRENT_TABLE:
          serviceImpl.changeCurrentTable((org.example.oneindex) request,
              (io.grpc.stub.StreamObserver<org.example.oneindex>) responseObserver);
          break;
        case METHODID_BASE_HAS_PATH:
          serviceImpl.baseHasPath((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.logical>) responseObserver);
          break;
        case METHODID_CHANGED:
          serviceImpl.changed((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.logical>) responseObserver);
          break;
        case METHODID_SAVE:
          serviceImpl.save((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.oneindex>) responseObserver);
          break;
        case METHODID_GET_ALL_FILES:
          serviceImpl.getAllFiles((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.onlystring>) responseObserver);
          break;
        case METHODID_SAVE_AS:
          serviceImpl.saveAs((org.example.onlystring) request,
              (io.grpc.stub.StreamObserver<org.example.oneindex>) responseObserver);
          break;
        case METHODID_CREATE_TABLE:
          serviceImpl.createTable((org.example.table) request,
              (io.grpc.stub.StreamObserver<org.example.oneindex>) responseObserver);
          break;
        case METHODID_OPEN_TABLE:
          serviceImpl.openTable((org.example.onlystring) request,
              (io.grpc.stub.StreamObserver<org.example.oneindex>) responseObserver);
          break;
        case METHODID_DELETE_TABLE:
          serviceImpl.deleteTable((org.example.onlystring) request,
              (io.grpc.stub.StreamObserver<org.example.oneindex>) responseObserver);
          break;
        case METHODID_ADD_ROW:
          serviceImpl.addRow((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_ROWS:
          serviceImpl.deleteRows((org.example.twoindex) request,
              (io.grpc.stub.StreamObserver<org.example.oneindex>) responseObserver);
          break;
        case METHODID_CHANGE_ROW_VALUE:
          serviceImpl.changeRowValue((org.example.changevalue) request,
              (io.grpc.stub.StreamObserver<org.example.oneindex>) responseObserver);
          break;
        case METHODID_GET_PATH:
          serviceImpl.getPath((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.onlystring>) responseObserver);
          break;
        case METHODID_UNION:
          serviceImpl.union((org.example.union) request,
              (io.grpc.stub.StreamObserver<org.example.oneindex>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SUBDServiceGRPCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SUBDServiceGRPCBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.Protobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SUBDServiceGRPC");
    }
  }

  private static final class SUBDServiceGRPCFileDescriptorSupplier
      extends SUBDServiceGRPCBaseDescriptorSupplier {
    SUBDServiceGRPCFileDescriptorSupplier() {}
  }

  private static final class SUBDServiceGRPCMethodDescriptorSupplier
      extends SUBDServiceGRPCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SUBDServiceGRPCMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SUBDServiceGRPCGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SUBDServiceGRPCFileDescriptorSupplier())
              .addMethod(getOpenNewMethod())
              .addMethod(getOpenBaseMethod())
              .addMethod(getBaseOpenedMethod())
              .addMethod(getTableOpenedMethod())
              .addMethod(getRowsInTableMethod())
              .addMethod(getColumnsInTableMethod())
              .addMethod(getGetNameInCurrentTableMethod())
              .addMethod(getGetTypeInCurrentTableMethod())
              .addMethod(getGetValueInTableMethod())
              .addMethod(getGetNumberOfTablesMethod())
              .addMethod(getGetNumberOfFieldsInTableMethod())
              .addMethod(getGetTableNameMethod())
              .addMethod(getGetCurrentTableNameMethod())
              .addMethod(getGetNameInTableMethod())
              .addMethod(getGetTypeInTableMethod())
              .addMethod(getChangeCurrentTableMethod())
              .addMethod(getBaseHasPathMethod())
              .addMethod(getChangedMethod())
              .addMethod(getSaveMethod())
              .addMethod(getGetAllFilesMethod())
              .addMethod(getSaveAsMethod())
              .addMethod(getCreateTableMethod())
              .addMethod(getOpenTableMethod())
              .addMethod(getDeleteTableMethod())
              .addMethod(getAddRowMethod())
              .addMethod(getDeleteRowsMethod())
              .addMethod(getChangeRowValueMethod())
              .addMethod(getGetPathMethod())
              .addMethod(getUnionMethod())
              .addMethod(getCloseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
