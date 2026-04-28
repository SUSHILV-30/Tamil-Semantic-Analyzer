public class EvalVisitor extends TamilBaseVisitor<Void> {

    @Override
    public Void visitSentence(TamilParser.SentenceContext ctx) {

        String fullSentence = ctx.getText();

        // Check question sentences
        if (ctx.QUESTION_WORD() != null) {

            boolean hasVerb = false;

            for (TamilParser.ClauseContext clauseCtx : ctx.clause()) {
                if (clauseCtx.verbPhrase() != null) {
                    hasVerb = true;
                }
            }

            if (!hasVerb) {
                printError(fullSentence,
                        "Question sentence does not contain a verb.");
            }
        }

        return visitChildren(ctx);
    }

    @Override
    public Void visitClause(TamilParser.ClauseContext ctx) {

        String subject = "";
        String verb = "";

        if (ctx.subject() != null) {
            subject = ctx.subject().getText();
        }

        if (ctx.verbPhrase() != null) {

            if (ctx.verbPhrase().TENSE_SUFFIX() != null) {
                verb = ctx.verbPhrase().TENSE_SUFFIX().getText();
            }
            else if (ctx.verbPhrase().TAMIL_WORD() != null) {
                verb = ctx.verbPhrase().TAMIL_WORD().getText();
            }
        }

        checkAgreement(ctx, subject, verb);

        return visitChildren(ctx);
    }

    private void checkAgreement(TamilParser.ClauseContext ctx,
                                String subject,
                                String verb) {

        if (subject.isEmpty() || verb.isEmpty())
            return;

        String fullSentence = ctx.getParent().getText();

        // Singular subject using plural verb
        if (subject.equals("நான்") && verb.equals("வந்தார்கள்")) {
            printError(fullSentence,
                    "Singular subject 'நான்' cannot use plural verb '" + verb + "'.");
        }

        if (subject.equals("அவன்") && verb.equals("வந்தார்கள்")) {
            printError(fullSentence,
                    "Singular subject 'அவன்' cannot use plural verb '" + verb + "'.");
        }

        if (subject.equals("அவள்") && verb.equals("வந்தார்கள்")) {
            printError(fullSentence,
                    "Singular subject 'அவள்' cannot use plural verb '" + verb + "'.");
        }

        // Plural subject using singular verb
        if (subject.equals("அவர்கள்") && verb.equals("வந்தான்")) {
            printError(fullSentence,
                    "Plural subject 'அவர்கள்' cannot use singular verb '" + verb + "'.");
        }
    }

    private void printError(String sentence, String reason) {

        System.out.println("\nSemantic Error in sentence: " + sentence);
        System.out.println("Reason: " + reason);
    }
}