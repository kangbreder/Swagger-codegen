//
// GetFixedDepositAccountsStatus.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetFixedDepositAccountsStatus: Codable {

    public var _id: Int?
    public var code: String?
    public var value: String?
    public var submittedAndPendingApproval: Bool?
    public var approved: Bool?
    public var rejected: Bool?
    public var withdrawnByApplicant: Bool?
    public var active: Bool?
    public var closed: Bool?
    public var prematureClosed: Bool?
    public var transferInProgress: Bool?
    public var transferOnHold: Bool?

    public init(_id: Int?, code: String?, value: String?, submittedAndPendingApproval: Bool?, approved: Bool?, rejected: Bool?, withdrawnByApplicant: Bool?, active: Bool?, closed: Bool?, prematureClosed: Bool?, transferInProgress: Bool?, transferOnHold: Bool?) {
        self._id = _id
        self.code = code
        self.value = value
        self.submittedAndPendingApproval = submittedAndPendingApproval
        self.approved = approved
        self.rejected = rejected
        self.withdrawnByApplicant = withdrawnByApplicant
        self.active = active
        self.closed = closed
        self.prematureClosed = prematureClosed
        self.transferInProgress = transferInProgress
        self.transferOnHold = transferOnHold
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case code
        case value
        case submittedAndPendingApproval
        case approved
        case rejected
        case withdrawnByApplicant
        case active
        case closed
        case prematureClosed
        case transferInProgress
        case transferOnHold
    }


}

