//
// GetClientsStaffOptions.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetClientsStaffOptions: Codable {

    public var _id: Int?
    public var firstname: String?
    public var lastname: String?
    public var displayName: String?
    public var officeId: Int?
    public var officeName: String?
    public var isLoanOfficer: Bool?
    public var isActive: Bool?

    public init(_id: Int?, firstname: String?, lastname: String?, displayName: String?, officeId: Int?, officeName: String?, isLoanOfficer: Bool?, isActive: Bool?) {
        self._id = _id
        self.firstname = firstname
        self.lastname = lastname
        self.displayName = displayName
        self.officeId = officeId
        self.officeName = officeName
        self.isLoanOfficer = isLoanOfficer
        self.isActive = isActive
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case firstname
        case lastname
        case displayName
        case officeId
        case officeName
        case isLoanOfficer
        case isActive
    }


}

