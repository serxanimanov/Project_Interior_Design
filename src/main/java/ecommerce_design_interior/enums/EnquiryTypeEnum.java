package ecommerce_design_interior.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EnquiryTypeEnum {

    GENERAL_INQUIRY("General Inquiry", "General questions or requests about the product or service"),
    TECHNICAL_SUPPORT("Technical Support", "Issues related to technical problems or difficulties"),
    BILLING("Billing", "Questions regarding invoices, payments, or subscription details"),
    FEEDBACK("Feedback", "Suggestions or feedback regarding the product or service"),
    COMPLAINT("Complaint", "Formal complaints regarding the product or service"),
    FEATURE_REQUEST("Feature Request", "Suggestions for new features or improvements"),
    ORDER_STATUS("Order Status", "Inquiries related to the status of an order or delivery"),
    ACCOUNT_HELP("Account Help", "Assistance with account settings, login, or registration issues"),
    RETURNS_EXCHANGE("Returns/Exchange", "Queries regarding product returns, exchanges, or refunds");

    private final String label;
    private final String description;

}