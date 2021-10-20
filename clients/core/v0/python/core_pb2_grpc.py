# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import core_pb2 as core__pb2


class CoreStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.getStatus = channel.unary_unary(
        '/org.dash.platform.dapi.v0.Core/getStatus',
        request_serializer=core__pb2.GetStatusRequest.SerializeToString,
        response_deserializer=core__pb2.GetStatusResponse.FromString,
        )
    self.getBlock = channel.unary_unary(
        '/org.dash.platform.dapi.v0.Core/getBlock',
        request_serializer=core__pb2.GetBlockRequest.SerializeToString,
        response_deserializer=core__pb2.GetBlockResponse.FromString,
        )
    self.broadcastTransaction = channel.unary_unary(
        '/org.dash.platform.dapi.v0.Core/broadcastTransaction',
        request_serializer=core__pb2.BroadcastTransactionRequest.SerializeToString,
        response_deserializer=core__pb2.BroadcastTransactionResponse.FromString,
        )
    self.getTransaction = channel.unary_unary(
        '/org.dash.platform.dapi.v0.Core/getTransaction',
        request_serializer=core__pb2.GetTransactionRequest.SerializeToString,
        response_deserializer=core__pb2.GetTransactionResponse.FromString,
        )
    self.getEstimatedTransactionFee = channel.unary_unary(
        '/org.dash.platform.dapi.v0.Core/getEstimatedTransactionFee',
        request_serializer=core__pb2.GetEstimatedTransactionFeeRequest.SerializeToString,
        response_deserializer=core__pb2.GetEstimatedTransactionFeeResponse.FromString,
        )
    self.subscribeToBlockHeadersWithChainLocks = channel.unary_stream(
        '/org.dash.platform.dapi.v0.Core/subscribeToBlockHeadersWithChainLocks',
        request_serializer=core__pb2.BlockHeadersWithChainLocksRequest.SerializeToString,
        response_deserializer=core__pb2.BlockHeadersWithChainLocksResponse.FromString,
        )
    self.subscribeToTransactionsWithProofs = channel.unary_stream(
        '/org.dash.platform.dapi.v0.Core/subscribeToTransactionsWithProofs',
        request_serializer=core__pb2.TransactionsWithProofsRequest.SerializeToString,
        response_deserializer=core__pb2.TransactionsWithProofsResponse.FromString,
        )
    self.getAddressBalance = channel.unary_unary(
        '/org.dash.platform.dapi.v0.Core/getAddressBalance',
        request_serializer=core__pb2.GetAddressBalanceRequest.SerializeToString,
        response_deserializer=core__pb2.GetAddressBalanceResponse.FromString,
        )


class CoreServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def getStatus(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def getBlock(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def broadcastTransaction(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def getTransaction(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def getEstimatedTransactionFee(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def subscribeToBlockHeadersWithChainLocks(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def subscribeToTransactionsWithProofs(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def getAddressBalance(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_CoreServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'getStatus': grpc.unary_unary_rpc_method_handler(
          servicer.getStatus,
          request_deserializer=core__pb2.GetStatusRequest.FromString,
          response_serializer=core__pb2.GetStatusResponse.SerializeToString,
      ),
      'getBlock': grpc.unary_unary_rpc_method_handler(
          servicer.getBlock,
          request_deserializer=core__pb2.GetBlockRequest.FromString,
          response_serializer=core__pb2.GetBlockResponse.SerializeToString,
      ),
      'broadcastTransaction': grpc.unary_unary_rpc_method_handler(
          servicer.broadcastTransaction,
          request_deserializer=core__pb2.BroadcastTransactionRequest.FromString,
          response_serializer=core__pb2.BroadcastTransactionResponse.SerializeToString,
      ),
      'getTransaction': grpc.unary_unary_rpc_method_handler(
          servicer.getTransaction,
          request_deserializer=core__pb2.GetTransactionRequest.FromString,
          response_serializer=core__pb2.GetTransactionResponse.SerializeToString,
      ),
      'getEstimatedTransactionFee': grpc.unary_unary_rpc_method_handler(
          servicer.getEstimatedTransactionFee,
          request_deserializer=core__pb2.GetEstimatedTransactionFeeRequest.FromString,
          response_serializer=core__pb2.GetEstimatedTransactionFeeResponse.SerializeToString,
      ),
      'subscribeToBlockHeadersWithChainLocks': grpc.unary_stream_rpc_method_handler(
          servicer.subscribeToBlockHeadersWithChainLocks,
          request_deserializer=core__pb2.BlockHeadersWithChainLocksRequest.FromString,
          response_serializer=core__pb2.BlockHeadersWithChainLocksResponse.SerializeToString,
      ),
      'subscribeToTransactionsWithProofs': grpc.unary_stream_rpc_method_handler(
          servicer.subscribeToTransactionsWithProofs,
          request_deserializer=core__pb2.TransactionsWithProofsRequest.FromString,
          response_serializer=core__pb2.TransactionsWithProofsResponse.SerializeToString,
      ),
      'getAddressBalance': grpc.unary_unary_rpc_method_handler(
          servicer.getAddressBalance,
          request_deserializer=core__pb2.GetAddressBalanceRequest.FromString,
          response_serializer=core__pb2.GetAddressBalanceResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'org.dash.platform.dapi.v0.Core', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
