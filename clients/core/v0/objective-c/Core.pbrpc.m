#import "Core.pbrpc.h"

#import <ProtoRPC/ProtoRPC.h>
#import <RxLibrary/GRXWriter+Immediate.h>

@implementation Core

// Designated initializer
- (instancetype)initWithHost:(NSString *)host {
  return (self = [super initWithHost:host packageName:@"org.dash.platform.dapi.v0" serviceName:@"Core"]);
}

// Override superclass initializer to disallow different package and service names.
- (instancetype)initWithHost:(NSString *)host
                 packageName:(NSString *)packageName
                 serviceName:(NSString *)serviceName {
  return [self initWithHost:host];
}

+ (instancetype)serviceWithHost:(NSString *)host {
  return [[self alloc] initWithHost:host];
}


#pragma mark getStatus(GetStatusRequest) returns (GetStatusResponse)

- (void)getStatusWithRequest:(GetStatusRequest *)request handler:(void(^)(GetStatusResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCTogetStatusWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCTogetStatusWithRequest:(GetStatusRequest *)request handler:(void(^)(GetStatusResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"getStatus"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetStatusResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
#pragma mark getBlock(GetBlockRequest) returns (GetBlockResponse)

- (void)getBlockWithRequest:(GetBlockRequest *)request handler:(void(^)(GetBlockResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCTogetBlockWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCTogetBlockWithRequest:(GetBlockRequest *)request handler:(void(^)(GetBlockResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"getBlock"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetBlockResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
#pragma mark broadcastTransaction(BroadcastTransactionRequest) returns (BroadcastTransactionResponse)

- (void)broadcastTransactionWithRequest:(BroadcastTransactionRequest *)request handler:(void(^)(BroadcastTransactionResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCTobroadcastTransactionWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCTobroadcastTransactionWithRequest:(BroadcastTransactionRequest *)request handler:(void(^)(BroadcastTransactionResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"broadcastTransaction"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[BroadcastTransactionResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
#pragma mark getTransaction(GetTransactionRequest) returns (GetTransactionResponse)

- (void)getTransactionWithRequest:(GetTransactionRequest *)request handler:(void(^)(GetTransactionResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCTogetTransactionWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCTogetTransactionWithRequest:(GetTransactionRequest *)request handler:(void(^)(GetTransactionResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"getTransaction"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetTransactionResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
#pragma mark getEstimatedTransactionFee(GetEstimatedTransactionFeeRequest) returns (GetEstimatedTransactionFeeResponse)

- (void)getEstimatedTransactionFeeWithRequest:(GetEstimatedTransactionFeeRequest *)request handler:(void(^)(GetEstimatedTransactionFeeResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCTogetEstimatedTransactionFeeWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCTogetEstimatedTransactionFeeWithRequest:(GetEstimatedTransactionFeeRequest *)request handler:(void(^)(GetEstimatedTransactionFeeResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"getEstimatedTransactionFee"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetEstimatedTransactionFeeResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
#pragma mark subscribeToBlockHeadersWithChainLocks(BlockHeadersWithChainLocksRequest) returns (stream BlockHeadersWithChainLocksResponse)

- (void)subscribeToBlockHeadersWithChainLocksWithRequest:(BlockHeadersWithChainLocksRequest *)request eventHandler:(void(^)(BOOL done, BlockHeadersWithChainLocksResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCTosubscribeToBlockHeadersWithChainLocksWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCTosubscribeToBlockHeadersWithChainLocksWithRequest:(BlockHeadersWithChainLocksRequest *)request eventHandler:(void(^)(BOOL done, BlockHeadersWithChainLocksResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"subscribeToBlockHeadersWithChainLocks"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[BlockHeadersWithChainLocksResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
#pragma mark subscribeToTransactionsWithProofs(TransactionsWithProofsRequest) returns (stream TransactionsWithProofsResponse)

- (void)subscribeToTransactionsWithProofsWithRequest:(TransactionsWithProofsRequest *)request eventHandler:(void(^)(BOOL done, TransactionsWithProofsResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCTosubscribeToTransactionsWithProofsWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCTosubscribeToTransactionsWithProofsWithRequest:(TransactionsWithProofsRequest *)request eventHandler:(void(^)(BOOL done, TransactionsWithProofsResponse *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"subscribeToTransactionsWithProofs"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[TransactionsWithProofsResponse class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
#pragma mark getAddressBalance(GetAddressBalanceRequest) returns (GetAddressBalanceResponse)

- (void)getAddressBalanceWithRequest:(GetAddressBalanceRequest *)request handler:(void(^)(GetAddressBalanceResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCTogetAddressBalanceWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCTogetAddressBalanceWithRequest:(GetAddressBalanceRequest *)request handler:(void(^)(GetAddressBalanceResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"getAddressBalance"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetAddressBalanceResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
#pragma mark getTransactionFee(GetTransactionFeeRequest) returns (GetTransactionFeeResponse)

- (void)getTransactionFeeWithRequest:(GetTransactionFeeRequest *)request handler:(void(^)(GetTransactionFeeResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCTogetTransactionFeeWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCTogetTransactionFeeWithRequest:(GetTransactionFeeRequest *)request handler:(void(^)(GetTransactionFeeResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"getTransactionFee"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetTransactionFeeResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
#pragma mark getAddressTransactions(GetAddressTransactionsRequest) returns (GetAddressTransactionsResponse)

- (void)getAddressTransactionsWithRequest:(GetAddressTransactionsRequest *)request handler:(void(^)(GetAddressTransactionsResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCTogetAddressTransactionsWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCTogetAddressTransactionsWithRequest:(GetAddressTransactionsRequest *)request handler:(void(^)(GetAddressTransactionsResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"getAddressTransactions"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetAddressTransactionsResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
#pragma mark getAddressUTXOs(GetAddressUTXORequest) returns (GetAddressUTXOResponse)

- (void)getAddressUTXOsWithRequest:(GetAddressUTXORequest *)request handler:(void(^)(GetAddressUTXOResponse *_Nullable response, NSError *_Nullable error))handler{
  [[self RPCTogetAddressUTXOsWithRequest:request handler:handler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCTogetAddressUTXOsWithRequest:(GetAddressUTXORequest *)request handler:(void(^)(GetAddressUTXOResponse *_Nullable response, NSError *_Nullable error))handler{
  return [self RPCToMethod:@"getAddressUTXOs"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[GetAddressUTXOResponse class]
        responsesWriteable:[GRXWriteable writeableWithSingleHandler:handler]];
}
@end
