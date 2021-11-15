package org.dash.platform.dapi.v0;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: core.proto")
public final class CoreGrpc {

  private CoreGrpc() {}

  public static final String SERVICE_NAME = "org.dash.platform.dapi.v0.Core";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.dash.platform.dapi.v0.CoreOuterClass.GetStatusRequest,
      org.dash.platform.dapi.v0.CoreOuterClass.GetStatusResponse> METHOD_GET_STATUS =
      io.grpc.MethodDescriptor.<org.dash.platform.dapi.v0.CoreOuterClass.GetStatusRequest, org.dash.platform.dapi.v0.CoreOuterClass.GetStatusResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.dash.platform.dapi.v0.Core", "getStatus"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.GetStatusRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.GetStatusResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.dash.platform.dapi.v0.CoreOuterClass.GetBlockRequest,
      org.dash.platform.dapi.v0.CoreOuterClass.GetBlockResponse> METHOD_GET_BLOCK =
      io.grpc.MethodDescriptor.<org.dash.platform.dapi.v0.CoreOuterClass.GetBlockRequest, org.dash.platform.dapi.v0.CoreOuterClass.GetBlockResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.dash.platform.dapi.v0.Core", "getBlock"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.GetBlockRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.GetBlockResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.dash.platform.dapi.v0.CoreOuterClass.BroadcastTransactionRequest,
      org.dash.platform.dapi.v0.CoreOuterClass.BroadcastTransactionResponse> METHOD_BROADCAST_TRANSACTION =
      io.grpc.MethodDescriptor.<org.dash.platform.dapi.v0.CoreOuterClass.BroadcastTransactionRequest, org.dash.platform.dapi.v0.CoreOuterClass.BroadcastTransactionResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.dash.platform.dapi.v0.Core", "broadcastTransaction"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.BroadcastTransactionRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.BroadcastTransactionResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionRequest,
      org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionResponse> METHOD_GET_TRANSACTION =
      io.grpc.MethodDescriptor.<org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionRequest, org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.dash.platform.dapi.v0.Core", "getTransaction"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.dash.platform.dapi.v0.CoreOuterClass.GetEstimatedTransactionFeeRequest,
      org.dash.platform.dapi.v0.CoreOuterClass.GetEstimatedTransactionFeeResponse> METHOD_GET_ESTIMATED_TRANSACTION_FEE =
      io.grpc.MethodDescriptor.<org.dash.platform.dapi.v0.CoreOuterClass.GetEstimatedTransactionFeeRequest, org.dash.platform.dapi.v0.CoreOuterClass.GetEstimatedTransactionFeeResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.dash.platform.dapi.v0.Core", "getEstimatedTransactionFee"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.GetEstimatedTransactionFeeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.GetEstimatedTransactionFeeResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.dash.platform.dapi.v0.CoreOuterClass.BlockHeadersWithChainLocksRequest,
      org.dash.platform.dapi.v0.CoreOuterClass.BlockHeadersWithChainLocksResponse> METHOD_SUBSCRIBE_TO_BLOCK_HEADERS_WITH_CHAIN_LOCKS =
      io.grpc.MethodDescriptor.<org.dash.platform.dapi.v0.CoreOuterClass.BlockHeadersWithChainLocksRequest, org.dash.platform.dapi.v0.CoreOuterClass.BlockHeadersWithChainLocksResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "org.dash.platform.dapi.v0.Core", "subscribeToBlockHeadersWithChainLocks"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.BlockHeadersWithChainLocksRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.BlockHeadersWithChainLocksResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.dash.platform.dapi.v0.CoreOuterClass.TransactionsWithProofsRequest,
      org.dash.platform.dapi.v0.CoreOuterClass.TransactionsWithProofsResponse> METHOD_SUBSCRIBE_TO_TRANSACTIONS_WITH_PROOFS =
      io.grpc.MethodDescriptor.<org.dash.platform.dapi.v0.CoreOuterClass.TransactionsWithProofsRequest, org.dash.platform.dapi.v0.CoreOuterClass.TransactionsWithProofsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "org.dash.platform.dapi.v0.Core", "subscribeToTransactionsWithProofs"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.TransactionsWithProofsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.TransactionsWithProofsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.dash.platform.dapi.v0.CoreOuterClass.GetAddressBalanceRequest,
      org.dash.platform.dapi.v0.CoreOuterClass.GetAddressBalanceResponse> METHOD_GET_ADDRESS_BALANCE =
      io.grpc.MethodDescriptor.<org.dash.platform.dapi.v0.CoreOuterClass.GetAddressBalanceRequest, org.dash.platform.dapi.v0.CoreOuterClass.GetAddressBalanceResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.dash.platform.dapi.v0.Core", "getAddressBalance"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.GetAddressBalanceRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.GetAddressBalanceResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionFeeRequest,
      org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionFeeResponse> METHOD_GET_TRANSACTION_FEE =
      io.grpc.MethodDescriptor.<org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionFeeRequest, org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionFeeResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.dash.platform.dapi.v0.Core", "getTransactionFee"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionFeeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionFeeResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.dash.platform.dapi.v0.CoreOuterClass.GetAddressTransactionsRequest,
      org.dash.platform.dapi.v0.CoreOuterClass.GetAddressTransactionsResponse> METHOD_GET_ADDRESS_TRANSACTIONS =
      io.grpc.MethodDescriptor.<org.dash.platform.dapi.v0.CoreOuterClass.GetAddressTransactionsRequest, org.dash.platform.dapi.v0.CoreOuterClass.GetAddressTransactionsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.dash.platform.dapi.v0.Core", "getAddressTransactions"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.GetAddressTransactionsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.GetAddressTransactionsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.dash.platform.dapi.v0.CoreOuterClass.GetAddressUTXORequest,
      org.dash.platform.dapi.v0.CoreOuterClass.GetAddressUTXOResponse> METHOD_GET_ADDRESS_UTXOS =
      io.grpc.MethodDescriptor.<org.dash.platform.dapi.v0.CoreOuterClass.GetAddressUTXORequest, org.dash.platform.dapi.v0.CoreOuterClass.GetAddressUTXOResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.dash.platform.dapi.v0.Core", "getAddressUTXOs"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.GetAddressUTXORequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.dash.platform.dapi.v0.CoreOuterClass.GetAddressUTXOResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CoreStub newStub(io.grpc.Channel channel) {
    return new CoreStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CoreBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CoreFutureStub(channel);
  }

  /**
   */
  public static abstract class CoreImplBase implements io.grpc.BindableService {

    /**
     */
    public void getStatus(org.dash.platform.dapi.v0.CoreOuterClass.GetStatusRequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STATUS, responseObserver);
    }

    /**
     */
    public void getBlock(org.dash.platform.dapi.v0.CoreOuterClass.GetBlockRequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetBlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BLOCK, responseObserver);
    }

    /**
     */
    public void broadcastTransaction(org.dash.platform.dapi.v0.CoreOuterClass.BroadcastTransactionRequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.BroadcastTransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BROADCAST_TRANSACTION, responseObserver);
    }

    /**
     */
    public void getTransaction(org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionRequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TRANSACTION, responseObserver);
    }

    /**
     */
    public void getEstimatedTransactionFee(org.dash.platform.dapi.v0.CoreOuterClass.GetEstimatedTransactionFeeRequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetEstimatedTransactionFeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ESTIMATED_TRANSACTION_FEE, responseObserver);
    }

    /**
     */
    public void subscribeToBlockHeadersWithChainLocks(org.dash.platform.dapi.v0.CoreOuterClass.BlockHeadersWithChainLocksRequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.BlockHeadersWithChainLocksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SUBSCRIBE_TO_BLOCK_HEADERS_WITH_CHAIN_LOCKS, responseObserver);
    }

    /**
     */
    public void subscribeToTransactionsWithProofs(org.dash.platform.dapi.v0.CoreOuterClass.TransactionsWithProofsRequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.TransactionsWithProofsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SUBSCRIBE_TO_TRANSACTIONS_WITH_PROOFS, responseObserver);
    }

    /**
     */
    public void getAddressBalance(org.dash.platform.dapi.v0.CoreOuterClass.GetAddressBalanceRequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetAddressBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ADDRESS_BALANCE, responseObserver);
    }

    /**
     */
    public void getTransactionFee(org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionFeeRequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionFeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TRANSACTION_FEE, responseObserver);
    }

    /**
     */
    public void getAddressTransactions(org.dash.platform.dapi.v0.CoreOuterClass.GetAddressTransactionsRequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetAddressTransactionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ADDRESS_TRANSACTIONS, responseObserver);
    }

    /**
     */
    public void getAddressUTXOs(org.dash.platform.dapi.v0.CoreOuterClass.GetAddressUTXORequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetAddressUTXOResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ADDRESS_UTXOS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_STATUS,
            asyncUnaryCall(
              new MethodHandlers<
                org.dash.platform.dapi.v0.CoreOuterClass.GetStatusRequest,
                org.dash.platform.dapi.v0.CoreOuterClass.GetStatusResponse>(
                  this, METHODID_GET_STATUS)))
          .addMethod(
            METHOD_GET_BLOCK,
            asyncUnaryCall(
              new MethodHandlers<
                org.dash.platform.dapi.v0.CoreOuterClass.GetBlockRequest,
                org.dash.platform.dapi.v0.CoreOuterClass.GetBlockResponse>(
                  this, METHODID_GET_BLOCK)))
          .addMethod(
            METHOD_BROADCAST_TRANSACTION,
            asyncUnaryCall(
              new MethodHandlers<
                org.dash.platform.dapi.v0.CoreOuterClass.BroadcastTransactionRequest,
                org.dash.platform.dapi.v0.CoreOuterClass.BroadcastTransactionResponse>(
                  this, METHODID_BROADCAST_TRANSACTION)))
          .addMethod(
            METHOD_GET_TRANSACTION,
            asyncUnaryCall(
              new MethodHandlers<
                org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionRequest,
                org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionResponse>(
                  this, METHODID_GET_TRANSACTION)))
          .addMethod(
            METHOD_GET_ESTIMATED_TRANSACTION_FEE,
            asyncUnaryCall(
              new MethodHandlers<
                org.dash.platform.dapi.v0.CoreOuterClass.GetEstimatedTransactionFeeRequest,
                org.dash.platform.dapi.v0.CoreOuterClass.GetEstimatedTransactionFeeResponse>(
                  this, METHODID_GET_ESTIMATED_TRANSACTION_FEE)))
          .addMethod(
            METHOD_SUBSCRIBE_TO_BLOCK_HEADERS_WITH_CHAIN_LOCKS,
            asyncServerStreamingCall(
              new MethodHandlers<
                org.dash.platform.dapi.v0.CoreOuterClass.BlockHeadersWithChainLocksRequest,
                org.dash.platform.dapi.v0.CoreOuterClass.BlockHeadersWithChainLocksResponse>(
                  this, METHODID_SUBSCRIBE_TO_BLOCK_HEADERS_WITH_CHAIN_LOCKS)))
          .addMethod(
            METHOD_SUBSCRIBE_TO_TRANSACTIONS_WITH_PROOFS,
            asyncServerStreamingCall(
              new MethodHandlers<
                org.dash.platform.dapi.v0.CoreOuterClass.TransactionsWithProofsRequest,
                org.dash.platform.dapi.v0.CoreOuterClass.TransactionsWithProofsResponse>(
                  this, METHODID_SUBSCRIBE_TO_TRANSACTIONS_WITH_PROOFS)))
          .addMethod(
            METHOD_GET_ADDRESS_BALANCE,
            asyncUnaryCall(
              new MethodHandlers<
                org.dash.platform.dapi.v0.CoreOuterClass.GetAddressBalanceRequest,
                org.dash.platform.dapi.v0.CoreOuterClass.GetAddressBalanceResponse>(
                  this, METHODID_GET_ADDRESS_BALANCE)))
          .addMethod(
            METHOD_GET_TRANSACTION_FEE,
            asyncUnaryCall(
              new MethodHandlers<
                org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionFeeRequest,
                org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionFeeResponse>(
                  this, METHODID_GET_TRANSACTION_FEE)))
          .addMethod(
            METHOD_GET_ADDRESS_TRANSACTIONS,
            asyncUnaryCall(
              new MethodHandlers<
                org.dash.platform.dapi.v0.CoreOuterClass.GetAddressTransactionsRequest,
                org.dash.platform.dapi.v0.CoreOuterClass.GetAddressTransactionsResponse>(
                  this, METHODID_GET_ADDRESS_TRANSACTIONS)))
          .addMethod(
            METHOD_GET_ADDRESS_UTXOS,
            asyncUnaryCall(
              new MethodHandlers<
                org.dash.platform.dapi.v0.CoreOuterClass.GetAddressUTXORequest,
                org.dash.platform.dapi.v0.CoreOuterClass.GetAddressUTXOResponse>(
                  this, METHODID_GET_ADDRESS_UTXOS)))
          .build();
    }
  }

  /**
   */
  public static final class CoreStub extends io.grpc.stub.AbstractStub<CoreStub> {
    private CoreStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CoreStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CoreStub(channel, callOptions);
    }

    /**
     */
    public void getStatus(org.dash.platform.dapi.v0.CoreOuterClass.GetStatusRequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STATUS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlock(org.dash.platform.dapi.v0.CoreOuterClass.GetBlockRequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetBlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BLOCK, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void broadcastTransaction(org.dash.platform.dapi.v0.CoreOuterClass.BroadcastTransactionRequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.BroadcastTransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BROADCAST_TRANSACTION, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransaction(org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionRequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TRANSACTION, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEstimatedTransactionFee(org.dash.platform.dapi.v0.CoreOuterClass.GetEstimatedTransactionFeeRequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetEstimatedTransactionFeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ESTIMATED_TRANSACTION_FEE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeToBlockHeadersWithChainLocks(org.dash.platform.dapi.v0.CoreOuterClass.BlockHeadersWithChainLocksRequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.BlockHeadersWithChainLocksResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_SUBSCRIBE_TO_BLOCK_HEADERS_WITH_CHAIN_LOCKS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeToTransactionsWithProofs(org.dash.platform.dapi.v0.CoreOuterClass.TransactionsWithProofsRequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.TransactionsWithProofsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_SUBSCRIBE_TO_TRANSACTIONS_WITH_PROOFS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAddressBalance(org.dash.platform.dapi.v0.CoreOuterClass.GetAddressBalanceRequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetAddressBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ADDRESS_BALANCE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionFee(org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionFeeRequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionFeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TRANSACTION_FEE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAddressTransactions(org.dash.platform.dapi.v0.CoreOuterClass.GetAddressTransactionsRequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetAddressTransactionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ADDRESS_TRANSACTIONS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAddressUTXOs(org.dash.platform.dapi.v0.CoreOuterClass.GetAddressUTXORequest request,
        io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetAddressUTXOResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ADDRESS_UTXOS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CoreBlockingStub extends io.grpc.stub.AbstractStub<CoreBlockingStub> {
    private CoreBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CoreBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CoreBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.dash.platform.dapi.v0.CoreOuterClass.GetStatusResponse getStatus(org.dash.platform.dapi.v0.CoreOuterClass.GetStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STATUS, getCallOptions(), request);
    }

    /**
     */
    public org.dash.platform.dapi.v0.CoreOuterClass.GetBlockResponse getBlock(org.dash.platform.dapi.v0.CoreOuterClass.GetBlockRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BLOCK, getCallOptions(), request);
    }

    /**
     */
    public org.dash.platform.dapi.v0.CoreOuterClass.BroadcastTransactionResponse broadcastTransaction(org.dash.platform.dapi.v0.CoreOuterClass.BroadcastTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BROADCAST_TRANSACTION, getCallOptions(), request);
    }

    /**
     */
    public org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionResponse getTransaction(org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TRANSACTION, getCallOptions(), request);
    }

    /**
     */
    public org.dash.platform.dapi.v0.CoreOuterClass.GetEstimatedTransactionFeeResponse getEstimatedTransactionFee(org.dash.platform.dapi.v0.CoreOuterClass.GetEstimatedTransactionFeeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ESTIMATED_TRANSACTION_FEE, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.dash.platform.dapi.v0.CoreOuterClass.BlockHeadersWithChainLocksResponse> subscribeToBlockHeadersWithChainLocks(
        org.dash.platform.dapi.v0.CoreOuterClass.BlockHeadersWithChainLocksRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_SUBSCRIBE_TO_BLOCK_HEADERS_WITH_CHAIN_LOCKS, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.dash.platform.dapi.v0.CoreOuterClass.TransactionsWithProofsResponse> subscribeToTransactionsWithProofs(
        org.dash.platform.dapi.v0.CoreOuterClass.TransactionsWithProofsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_SUBSCRIBE_TO_TRANSACTIONS_WITH_PROOFS, getCallOptions(), request);
    }

    /**
     */
    public org.dash.platform.dapi.v0.CoreOuterClass.GetAddressBalanceResponse getAddressBalance(org.dash.platform.dapi.v0.CoreOuterClass.GetAddressBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ADDRESS_BALANCE, getCallOptions(), request);
    }

    /**
     */
    public org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionFeeResponse getTransactionFee(org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionFeeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TRANSACTION_FEE, getCallOptions(), request);
    }

    /**
     */
    public org.dash.platform.dapi.v0.CoreOuterClass.GetAddressTransactionsResponse getAddressTransactions(org.dash.platform.dapi.v0.CoreOuterClass.GetAddressTransactionsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ADDRESS_TRANSACTIONS, getCallOptions(), request);
    }

    /**
     */
    public org.dash.platform.dapi.v0.CoreOuterClass.GetAddressUTXOResponse getAddressUTXOs(org.dash.platform.dapi.v0.CoreOuterClass.GetAddressUTXORequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ADDRESS_UTXOS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CoreFutureStub extends io.grpc.stub.AbstractStub<CoreFutureStub> {
    private CoreFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CoreFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CoreFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dash.platform.dapi.v0.CoreOuterClass.GetStatusResponse> getStatus(
        org.dash.platform.dapi.v0.CoreOuterClass.GetStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STATUS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dash.platform.dapi.v0.CoreOuterClass.GetBlockResponse> getBlock(
        org.dash.platform.dapi.v0.CoreOuterClass.GetBlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BLOCK, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dash.platform.dapi.v0.CoreOuterClass.BroadcastTransactionResponse> broadcastTransaction(
        org.dash.platform.dapi.v0.CoreOuterClass.BroadcastTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BROADCAST_TRANSACTION, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionResponse> getTransaction(
        org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TRANSACTION, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dash.platform.dapi.v0.CoreOuterClass.GetEstimatedTransactionFeeResponse> getEstimatedTransactionFee(
        org.dash.platform.dapi.v0.CoreOuterClass.GetEstimatedTransactionFeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ESTIMATED_TRANSACTION_FEE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dash.platform.dapi.v0.CoreOuterClass.GetAddressBalanceResponse> getAddressBalance(
        org.dash.platform.dapi.v0.CoreOuterClass.GetAddressBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ADDRESS_BALANCE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionFeeResponse> getTransactionFee(
        org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionFeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TRANSACTION_FEE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dash.platform.dapi.v0.CoreOuterClass.GetAddressTransactionsResponse> getAddressTransactions(
        org.dash.platform.dapi.v0.CoreOuterClass.GetAddressTransactionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ADDRESS_TRANSACTIONS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dash.platform.dapi.v0.CoreOuterClass.GetAddressUTXOResponse> getAddressUTXOs(
        org.dash.platform.dapi.v0.CoreOuterClass.GetAddressUTXORequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ADDRESS_UTXOS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STATUS = 0;
  private static final int METHODID_GET_BLOCK = 1;
  private static final int METHODID_BROADCAST_TRANSACTION = 2;
  private static final int METHODID_GET_TRANSACTION = 3;
  private static final int METHODID_GET_ESTIMATED_TRANSACTION_FEE = 4;
  private static final int METHODID_SUBSCRIBE_TO_BLOCK_HEADERS_WITH_CHAIN_LOCKS = 5;
  private static final int METHODID_SUBSCRIBE_TO_TRANSACTIONS_WITH_PROOFS = 6;
  private static final int METHODID_GET_ADDRESS_BALANCE = 7;
  private static final int METHODID_GET_TRANSACTION_FEE = 8;
  private static final int METHODID_GET_ADDRESS_TRANSACTIONS = 9;
  private static final int METHODID_GET_ADDRESS_UTXOS = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CoreImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CoreImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((org.dash.platform.dapi.v0.CoreOuterClass.GetStatusRequest) request,
              (io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetStatusResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK:
          serviceImpl.getBlock((org.dash.platform.dapi.v0.CoreOuterClass.GetBlockRequest) request,
              (io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetBlockResponse>) responseObserver);
          break;
        case METHODID_BROADCAST_TRANSACTION:
          serviceImpl.broadcastTransaction((org.dash.platform.dapi.v0.CoreOuterClass.BroadcastTransactionRequest) request,
              (io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.BroadcastTransactionResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION:
          serviceImpl.getTransaction((org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionRequest) request,
              (io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionResponse>) responseObserver);
          break;
        case METHODID_GET_ESTIMATED_TRANSACTION_FEE:
          serviceImpl.getEstimatedTransactionFee((org.dash.platform.dapi.v0.CoreOuterClass.GetEstimatedTransactionFeeRequest) request,
              (io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetEstimatedTransactionFeeResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TO_BLOCK_HEADERS_WITH_CHAIN_LOCKS:
          serviceImpl.subscribeToBlockHeadersWithChainLocks((org.dash.platform.dapi.v0.CoreOuterClass.BlockHeadersWithChainLocksRequest) request,
              (io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.BlockHeadersWithChainLocksResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TO_TRANSACTIONS_WITH_PROOFS:
          serviceImpl.subscribeToTransactionsWithProofs((org.dash.platform.dapi.v0.CoreOuterClass.TransactionsWithProofsRequest) request,
              (io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.TransactionsWithProofsResponse>) responseObserver);
          break;
        case METHODID_GET_ADDRESS_BALANCE:
          serviceImpl.getAddressBalance((org.dash.platform.dapi.v0.CoreOuterClass.GetAddressBalanceRequest) request,
              (io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetAddressBalanceResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_FEE:
          serviceImpl.getTransactionFee((org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionFeeRequest) request,
              (io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetTransactionFeeResponse>) responseObserver);
          break;
        case METHODID_GET_ADDRESS_TRANSACTIONS:
          serviceImpl.getAddressTransactions((org.dash.platform.dapi.v0.CoreOuterClass.GetAddressTransactionsRequest) request,
              (io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetAddressTransactionsResponse>) responseObserver);
          break;
        case METHODID_GET_ADDRESS_UTXOS:
          serviceImpl.getAddressUTXOs((org.dash.platform.dapi.v0.CoreOuterClass.GetAddressUTXORequest) request,
              (io.grpc.stub.StreamObserver<org.dash.platform.dapi.v0.CoreOuterClass.GetAddressUTXOResponse>) responseObserver);
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

  private static final class CoreDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.dash.platform.dapi.v0.CoreOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CoreGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CoreDescriptorSupplier())
              .addMethod(METHOD_GET_STATUS)
              .addMethod(METHOD_GET_BLOCK)
              .addMethod(METHOD_BROADCAST_TRANSACTION)
              .addMethod(METHOD_GET_TRANSACTION)
              .addMethod(METHOD_GET_ESTIMATED_TRANSACTION_FEE)
              .addMethod(METHOD_SUBSCRIBE_TO_BLOCK_HEADERS_WITH_CHAIN_LOCKS)
              .addMethod(METHOD_SUBSCRIBE_TO_TRANSACTIONS_WITH_PROOFS)
              .addMethod(METHOD_GET_ADDRESS_BALANCE)
              .addMethod(METHOD_GET_TRANSACTION_FEE)
              .addMethod(METHOD_GET_ADDRESS_TRANSACTIONS)
              .addMethod(METHOD_GET_ADDRESS_UTXOS)
              .build();
        }
      }
    }
    return result;
  }
}
