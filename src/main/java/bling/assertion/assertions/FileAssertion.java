package bling.assertion.assertions;

import java.io.File;

import static bling.assertion.AssertionFailure.failWhen;
import static bling.assertion.AssertionFailure.failWhenFalse;

public class FileAssertion extends Assertion<FileAssertion, File> {

    public FileAssertion(File value) {
        super(value);
    }

    public FileAssertion exists() {
        isNotNull();

        failWhenFalse(value().exists(), "file [$s] does not exist", value().getAbsolutePath());

        return me();
    }

    public FileAssertion doesNotExist() {
        isNotNull();

        failWhen(value().exists(), "file [$s] exists", value().getAbsolutePath());

        return me();
    }

    public FileAssertion isDirectory() {
        isNotNull();

        failWhenFalse(value().isDirectory(), "file [$s] is not a directory", value().getAbsolutePath());

        return me();
    }

    public FileAssertion isNotDirectory() {
        isNotNull();

        failWhen(value().isDirectory(), "file [$s] is a directory", value().getAbsolutePath());

        return me();
    }

    public FileAssertion isEmptyFile() {
        exists();
        isNotDirectory();

        failWhen(value().length() != 0, "file [%s] is not empty, actual size [%s]", value().getAbsolutePath(), value().length());

        return me();
    }

    public FileAssertion isEmptyDirectory() {
        exists();
        isDirectory();

        failWhen(value().listFiles().length != 0, "directory [%s] is not empty", value().getAbsolutePath(), value().length());

        return me();
    }

    @Override
    protected FileAssertion me() {
        return this;
    }
}
