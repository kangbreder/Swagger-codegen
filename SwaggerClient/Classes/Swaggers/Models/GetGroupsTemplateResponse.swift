//
// GetGroupsTemplateResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetGroupsTemplateResponse: Codable {

    public var officeId: Int?
    public var officeOptions: [GetGroupsTemplateOfficeOptions]?
    public var staffOptions: [GetGroupsTemplateStaffOptions]?
    public var clientOptions: [GetGroupsTemplateClientOptions]?
    public var datatables: [GetGroupsTemplateDatatables]?

    public init(officeId: Int?, officeOptions: [GetGroupsTemplateOfficeOptions]?, staffOptions: [GetGroupsTemplateStaffOptions]?, clientOptions: [GetGroupsTemplateClientOptions]?, datatables: [GetGroupsTemplateDatatables]?) {
        self.officeId = officeId
        self.officeOptions = officeOptions
        self.staffOptions = staffOptions
        self.clientOptions = clientOptions
        self.datatables = datatables
    }


}

